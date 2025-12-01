package lesson19.hometask;

import lesson19.classtask.taskOptional.MovieGenre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRTaskManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <Task> taskList = new ArrayList<>();

        boolean davam = true;
        TaskStatus status =null;
        UrgencyLevel level = null;
        Boolean isCritic = true;
        while (davam){
            System.out.println("--- Əsas Menyu ---\n" +
                    "1. Yeni tapşırıq əlavə et\n" +
                    "2. Tapşırıq statusunu yenilə\n" +
                    "3. Tapşırığı Kritik olaraq qeyd et\n" +
                    "4. Tapşırıqları filtrləyərək göstər\n" +
                    "5. Kritik tapşırıqların ümumi saatını hesablasın (Bonus)\n" +
                    "6. Çıxış");
            System.out.println("Seçiminizi daxil edin: ");
            int secim = scan.nextInt();
            scan.nextLine();
            switch (secim){
                case 1:
                    System.out.println("1. Yeni tapşırıq əlavə et. ");

                    System.out.println("Tapşırıq ID-sini daxil edin (int): ");
                    Integer taskId = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Təxmini saatı daxil edin (String, məs: \"40.0\"): ");
                    String estimatedHours = scan.nextLine();

                    Double estimatedHourss = Double.parseDouble(estimatedHours);
                    System.out.println("Status daxil edin (PENDING, IN_PROGRESS, ON_HOLD, COMPLETED, ARCHIVED): ");
                    try{
                        String st = scan.nextLine().toUpperCase();
                        status = TaskStatus.valueOf(st.toUpperCase());}
                    catch (IllegalArgumentException e){
                        System.out.println("Status düzgün seçilməyib.");
                    }

                    System.out.println("Urgency daxil edin (ROUTINE, NORMAL, URGENT): ");
                    try{
                        String ur = scan.nextLine().toUpperCase();
                        level = UrgencyLevel.valueOf(ur.toUpperCase());}
                    catch (IllegalArgumentException e){
                        System.out.println("Urgency düzgün seçilməyib.");}

                    System.out.println("Kritikdir? true/false");
                    isCritic = scan.nextBoolean();

                Task task = new Task(taskId,estimatedHourss,status,level, isCritic);
                taskList.add(task);
                    System.out.println("Tapşırıq uğurla əlavə edildi!");
                    break;

                case 2:
                    System.out.println("Tapşırıq statusunu yenilə");

                    System.out.println("TaskId daxil edin: ");
                    Integer newTaskId = scan.nextInt();
                    scan.nextLine();
                    for (Task t :taskList){ //LISTDE SEARCH EDIRIK

                        if(t.getTaskId().equals(newTaskId)){ //EGER VARSA DEYISIKLIYE BASLAYIRIQ

                            System.out.println("Yeni status daxil edin (PENDING, IN_PROGRESS, ON_HOLD, COMPLETED, ARCHIVED)");
                            // YENI STATUS DAXIL EDIRIK
                            String yenist = scan.nextLine().toUpperCase();
                            try{

                               TaskStatus newStatus = TaskStatus.valueOf(yenist.toUpperCase());
                               //
                            t.updateStatus(newStatus);
                            switch (newStatus){
                                case PENDING, IN_PROGRESS, ON_HOLD, COMPLETED, ARCHIVED:
                                    System.out.println("Tapşırıq dəyişdi.");
                                    break;
                                default: //ehtiyac yoxdur amma yazmaq yaxsidir
                                    System.out.println("Bele secim yoxdur. ");
                                    break;
                            }
                            }catch (IllegalArgumentException e){
                                System.out.println("Status düzgün seçilməyib.");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Tapşırığı Kritik olaraq qeyd et");
                    System.out.println("TaskId daxil edin: ");
                    Integer newTaskIdForCritical = scan.nextInt();
                    scan.nextLine();
                    for (Task t :taskList){
                        if(t.getTaskId().equals(newTaskIdForCritical)){
                            t.isCritical = true;
                            System.out.println("Tapşırıq kritik olaraq qeyd edildi.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("4. Tapşırıqları filtrləyərək göstər (1.Yalnız COMPLETED 2.Yalnız URGENT 3.Yalnız kritik tapşırıqlar 4.Yalnız IN_PROGRESS");
                    Integer secimForFilt = scan.nextInt();
                    scan.nextLine();
                    Boolean found = false;
                    for (Task t :taskList){
                        switch (secimForFilt){
                            case 1:
                                System.out.println("Completed uzre filtr: ");
                                if (t.getStatus()==TaskStatus.COMPLETED){
                                    System.out.println(t);
                                    found = true;
                                }
                                break;
                            case 2:
                                System.out.println("Urgent uzre filtr: ");
                                if (t.getUrgency()==UrgencyLevel.URGENT){
                                    System.out.println(t);
                                    found = true;
                                }
                                break;
                            case 3:
                                System.out.println("Kritik uzre filtr: ");
                                if (t.getCritical()){
                                    System.out.println(t);
                                    found = true;
                                }
                                break;
                            case 4:
                                System.out.println("In progress uzre filtr: ");
                                if (t.getStatus()==TaskStatus.IN_PROGRESS){
                                    System.out.println(t);
                                    found = true;
                                }
                                break;
                            default:
                                System.out.println("Yanlış seçim. ");
                        }

                    }
                    if (!found){
                        System.out.println("Uyğun tapşırıq tapılmadı. ");
                    }
                    break;
                case 5:
                    System.out.println("5. Kritik tapşırıqların ümumi saatını hesablasın: ");
                    Double count = 0.0;
                    for (Task t :taskList){
                        if(isCritic == true){
                            count += t.getEstimatedHours();}
                    }
                    System.out.println(count);
                    break;
                case 6:
                    System.out.println("6. Çıxış. ");
                    davam=false;
                    break;
                default:
                    System.out.println("Bele secim yoxdur.");

            }
        }



scan.close();
    }
}
