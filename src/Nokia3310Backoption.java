import java.util.Scanner;

public class Nokia3310Backoption {
    public static void main(String[] args) {
     mainMenu();
    }

        private static Scanner input = new Scanner(System.in);
        private static int userInput;
        public static void mainMenu () {
            System.out.println("Enter a number to continue");
            System.out.println("""
                    press 1. for phoneBook
                    press 2. for Messages
                    press 3 Chat
                    press 4 for Call Register
                    press 5 for Tones
                    press 6 for Settings
                    press 7 for Calll divert
                    press 8 for Games 
                    press 9 for Calculator
                    press 10 for Reminder
                    press 11 for Clocks
                    press 12 for Profile
                    Press 13 for SIM Service
                    """);
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> phoneBook();
                case 2 -> messages();
                case 3 -> chat();
                case 4 -> callRegister();
                case 5 -> tones();
                case 6 -> settings();
                case 7 -> callDivert();
                case 8 -> games();
                case 9 -> calculator();
                case 10 -> reminders();
                case 11 -> clock();
                case 12 -> profiles();
                case 13 -> simService();
                case 14 -> mainMenu();
            }

    }
    private static void phoneBook() {
        System.out.println("""
                1. search
                2. service Nos
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tags
                11. back to mainMenu
                """);
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> search();
            case 2 -> serviceNos();
            case 3 -> addName();
            case 4 -> erase();
            case 5 -> edit();
            case 6 -> assignTone();
            case 7 -> sendbCard();
            case 8 -> options();
            case 9 -> speedDials();
            case 10 -> voiceTags();
            case 11 -> mainMenu();
        }

    }

    public static void search(){
        System.out.println("""
                search
                """);
        System.out.println("press 1 for phonebook");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> phoneBook();
        }
    }
    public static void serviceNos(){
        System.out.println(" Service Nos");
        System.out.println("press 1 for phonebook");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> phoneBook();
        }
    }
    public static void addName(){
        System.out.println(" Add name");
        System.out.println("press 1 for phonebook");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> phoneBook();
        }
    }
  public static void erase(){
      System.out.println("Erase");
      System.out.println("press 1 for phonebook");
      userInput = input.nextInt();
      switch(userInput){
          case 1 -> phoneBook();
      }
  }
  public static void edit(){
      System.out.println("Edit");
      System.out.println("press 1 for phoneBook");
      userInput = input.nextInt();
      switch(userInput){
          case 1 -> phoneBook();
      }
  }
  public static void assignTone(){
      System.out.println("Assign Tone");
      System.out.println("press 1 for phoneBook");
      userInput = input.nextInt();
      switch(userInput){
          case 1 -> phoneBook();
      }
  }
    public static void sendbCard(){
        System.out.println("send b'Card");
        System.out.println("press 1 for phoneBook");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> phoneBook();
        }
    }
   public static void options(){
       System.out.println("Options");
       System.out.println("""
               1. Type of view
               2. Memory status
               3. Go back to Phonebook
               """);
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> typeOfView();
           case 2 -> memoryStatus();
           case 3 -> phoneBook();
       }
   }
   public static void typeOfView(){
       System.out.println(" Type Of View");
       System.out.println("press 1 for option");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> options();
       }
   }
   public static void memoryStatus(){
       System.out.println("Memory Status");
       System.out.println("press 1 for option");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> options();
       }
   }
   public static void speedDials(){
       System.out.println(" Speed Dials");
       System.out.println("press `1 for phoneBook");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> phoneBook();
       }
   }
   public static void voiceTags(){
       System.out.println(" Voice tags");
       System.out.println("press 1 for phoneBook");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> phoneBook();
       }
   }
    private static void messages() {
        System.out.println("Messages");
        System.out.println("""
                1. for Write messages
                2. for Inbox
                3. for  Outbox
                4. for Picture messages
                5. for Templates
                6. for Smileys
                7.for Message settings
                8. for Info service
                9. for Voice mailbox number
                10. for Service command editor
                11. for mainMenu
                """);
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> writeMessages();
            case 2 -> inbox();
            case 3 -> outbox();
            case 4 -> pictureMessages();
            case 5 -> templates();
            case 6 -> smileys();
            case 7 -> messagesSettings();
            case 8 -> infoService();
            case 9 -> voicemailboxnumber();
            case 10 -> servicecommandeditor();
            case 11 -> mainMenu();

        }
    }
   public static void writeMessages(){
       System.out.println("""
               Write messages 
               1. to go back to Messages
               """);
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> messages();
       }
   }
   public static void inbox(){
       System.out.println("""
               Inbox
               1. to go back to messages
               """);
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> messages();
       }
   }
   public static void outbox(){
       System.out.println("""
               Outbox
               1. to go back to messages""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> messages();
       }
   }
   public static void pictureMessages(){
       System.out.println("""
               Picture messages
               1. to go to Messagea""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> messages();
       }
   }
   public static void templates(){
       System.out.println("""
               Templates
               1. to go to Messages""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> messages();
       }
   }
   public static void smileys(){
       System.out.println("""
               Smileys
               1. Go back to Messages""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> messages();
       }
   }
   public static void messagesSettings(){
       System.out.println("""
               1.Set 1
               2. Common
               3. Go back to Messages""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> set1();
           case 2 -> common();
           case 3 -> messages();
       }
   }
   public static void set1(){
       System.out.println("""
               Set 1
               1. Message centre number
               2. Messages sent as
               3. Message validity
               4. Go back to Messages settings""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> messageCentreNumber();
           case 2 -> messagesSentAs();
           case 3 -> messageValidity();
           case 4 -> messagesSettings();
       }
   }
   public static void messageCentreNumber(){
       System.out.println("""
                Messages centre number
                1.Go back to Set1""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> set1();
       }
   }
   public static void messagesSentAs(){
       System.out.println("""
               Messages sent as
               1. Go back to Set1""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> set1();
       }
   }
   public static void messageValidity(){
       System.out.println("""
               Message validity
               1. Go back to Set1""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> set1();
       }
   }
   public static void common(){
       System.out.println("""
               Common
               1. Delivery reports
               2. Reply via same centre
               3. Character support
               4. Messages""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> deliveryReports();
           case 2 -> replyViaSameCentre();
           case 3 -> characterSupport();
           case 4 -> messages();
       }
   }
   public static void deliveryReports(){
       System.out.println("""
               Delivery reports
               1. Go back to Common""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> common();
       }
   }
   public static void replyViaSameCentre(){
       System.out.println("""
               Reply via same centre
               1.Go back to common""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> common();
       }
   }
   public static void characterSupport(){
       System.out.println("""
               Character support
               1. Go back to common""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> common();
       }
   }
   public static void infoService(){
       System.out.println("""
               Info service
               1. Go back to common""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> common();
       }
   }
   public static void voicemailboxnumber(){
       System.out.println("""
               Voice mailbox number
               1. Go back to common""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> common();
       }
   }
   public static void servicecommandeditor(){
       System.out.println("""
               Service command editor
               1. Go back to Common""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> common();
       }
   }
    public static void chat(){
        System.out.println("""
                Chat
                1. Go back Main menu""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> mainMenu();
        }
   }
   public static void callRegister(){
       System.out.println("""
               Call register
               1. Missed calls
               2. Received calls
               3. Dialled numbers
               4. Erase recent call lists
               5. Show call duration
               6. Show call cost
               7. Call cost settings
               8. Prepaid credit
               9. Go back to main Menu""");
       userInput = input.nextInt();
       switch(userInput){
           case 1 -> missedCalls();
           case 2 -> receivedCalls();
           case 3 -> dialledNumber();
           case 4 -> eraseRecentCallLists();
           case 5 -> showCallDuration();
          case 6 -> showCallCost();
          case 7 -> callCostSettings();
           case 8 -> prepaidCredit();
           case 9 -> mainMenu();
       }
    }
    public static void missedCalls(){
        System.out.println("""
                Missed calls
                1.Go back to Call register""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> callRegister();
        }
    }
    public static void receivedCalls(){
        System.out.println("""
                Received calls
                1. Go back to call register""");
        userInput = input.nextInt(0);
        switch(userInput){
            case 1 -> callRegister();
        }
    }
    public static void dialledNumber(){
        System.out.println("""
                Dialled number
                1. Go back to Call register""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> callRegister();
        }
    }
    public static void eraseRecentCallLists(){
        System.out.println("""
                Erase recent call lists
                1. Go back to call register""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> callRegister();
        }
    }
    public static void showCallDuration(){
        System.out.println("""
                Show call duration
                1. Last call duration
                2. All call's duration
                3. Received call's duration
                4. Dialled call's duration
                5. Clear timers
                6. Go back to call register""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> lastCallDuration();
            case 2 -> allCallDuration();
            case 3 -> receivedCallDuration();
            case 4 -> dialledCallDuration();
            case 5 -> clearTimers();
            case 6 -> callRegister();
        }
    }
    public static void lastCallDuration(){
        System.out.println("""
                Last call duration
                1. Go back to Call register""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> showCallDuration();
        }
    }
    public static void allCallDuration(){
        System.out.println("""
                All  call duration
                1. Go back to Show call duration""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> showCallDuration();
        }
    }
    public static void receivedCallDuration(){
        System.out.println("""
                Received calls' duration
                1. Go back to Show call reaction""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> showCallDuration();
        }
    }
    public static void dialledCallDuration(){
        System.out.println("""
                Dialled call's duration
                1. Go back to show call duration""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> showCallDuration();
        }
    }
    public static void clearTimers(){
        System.out.println("""
                Clear timers
                1. Go back to show call duration""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> showCallDuration();
        }
    }
    public static void showCallCost(){
        System.out.println("""
                Show call cost
                1. Last call cost
                2. All calls' cost
                3. Clear counters
                4. Go back to Call register """);
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> lastCallCost();
            case 2 -> allCallCost();
            case 3 -> clearCounters();
            case 4 -> callRegister();
        }
    }
    public static void lastCallCost(){
        System.out.println("""
                Last call duration
                1. Go back to Show call costs""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> showCallCost();
        }
    }
    public static void allCallCost(){
        System.out.println("""
                All call cost
                1. Go back to show call costs""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> showCallCost();
        }
    }
    public static void clearCounters(){
        System.out.println("""
                Clear counters
                1. Go back to Show call costs""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> showCallCost();
        }
    }
    public static void callCostSettings(){
        System.out.println("""
                Call cost settings
                1. Call cost limit
                2. Show costs in 
                3. Go back to call register""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> callCostLimit();
            case 2 -> showCostIn();
            case 3 -> callRegister();
        }
    }
    public static void callCostLimit(){
        System.out.println("""
                Call cost limit
                1. Go back to call cost settings""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> callCostSettings();
        }
    }
    public static void showCostIn(){
        System.out.println("""
                Show call settings
                1. Go back to call cost settings""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> callCostSettings();
        }
    }
    public static void prepaidCredit(){
        System.out.println("""
                Prepaid credit
                1. Go back to Call register""");
        userInput = input.nextInt();
        switch(userInput) {
            case 1 -> callRegister();
        }
    }
    public static void tones(){
        System.out.println("""
                   Tones
                   1. Ringing tone
                   2. Ringing volume 
                   3. Incoming call alert
                   4. Composer
                   5. Message alert tone
                   6. Keypad tones
                   7. Warning and game tones
                   8. Vbrating alert 
                   9. Screen saver
                   10. Go back to main maenu""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> ringingTones();
            case 2 -> ringingVolume();
            case 3 -> incomingCallAlert();
            case 4 -> composer();
            case 5 -> messagesAlertTone();
            case 6 -> keypadTones();
            case 7 -> warningAndGameTones();
            case 8 -> vibratingAlert();
            case 9 -> screenSaver();
            case 10 -> mainMenu();
        }
    }
    public static void ringingTones(){
        System.out.println("""
                Ringing tones
                1. Go back to Tones""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> tones();
        }
    }
    public static void ringingVolume(){
        System.out.println("""
               Ringing volume
                1. Go back to Tones""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> tones();
        }
    }
    public static void incomingCallAlert(){
        System.out.println("""
                Incomming call alert
                1. Go back to Tones""");
        userInput = input.nextInt();
        switch(userInput){
        case 1 -> tones();
        }
    }
    public static void composer(){
        System.out.println("""
                Cpomposer
                1. Go back to Tones""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> tones();
        }
    }
    public static void messagesAlertTone(){
        System.out.println("""
                Messages alert tones
                1. Go back to Tones""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> tones();
        }
    }
    public static void keypadTones(){
        System.out.println("""
                Keypad tones
                1. Go back to tones""");
        userInput = input.nextInt();
        switch(userInput){
        case 1 -> tones();
        }
    }
    public static void warningAndGameTones(){
        System.out.println("""
                Warning and game tones
                1. Go back to Tones""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> tones();
        }
    }
    public static void vibratingAlert(){
        System.out.println("""
                Vibrsting alert
                1. Go back to tones""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> tones();
        }

    }
    public static void screenSaver(){
        System.out.println("""
                Screen saver
                1.  Go back to Tones""");
        userInput = input.nextInt();
        switch(userInput){
            case 2 -> tones();
        }
    }
    public static void settings(){
        System.out.println("""
                Settings
                1. Call settings
                2. Phone setting
                3. Security settings
                4. Go back to Main menu""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> callSettings();
            case 2 -> phoneSettings();
            case 3 -> securitySettings();
            case 4 -> restoreFactorySettings();
            case 5-> mainMenu();
        }
    }
    public static void callSettings(){
        System.out.println("""
               Call settings
               1.Automatic redial
               2. Speed dialling
               3. Call waiting options
               4. Own number sending
               5. Phone line in use
               6. Automatic answer
               7. Go back to Main menu""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> automaticRedial();
            case 2 -> speedDialling();
            case 3 -> callWaitingOptions();
            case 4 -> ownNumberSending();
            case 5 -> phoneLineInUse();
            case 6 -> automaticAnswer();
            case 7 -> mainMenu();
        }
    }
    public static void automaticRedial(){
        System.out.println("""
                Automatic redial
                1. Go back to Call settinga""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> callSettings();
        }
    }
    public static void speedDialling(){
        System.out.println("""
                Speed dialling
                1. Go back to Call settings""");
        userInput = input.nextInt();
        switch(userInput){
           case 1 -> callSettings();
        }
    }
    public static void callWaitingOptions(){
        System.out.println("""
                Call waiting options
                1. Go back to Call settings
                """);
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> callSettings();
        }
    }
     public static void ownNumberSending(){
         System.out.println("""
                 Own number settings
                 1. Go back to  Call settings""");
         userInput = input.nextInt();
         switch(userInput){
             case 1 -> callSettings();
         }
     }
     public static void phoneLineInUse(){
         System.out.println("""
                 Phone line in use
                 1. Go back to Call settigs""");
         userInput = input.nextInt();
         switch(userInput){
             case 1 -> callSettings();
         }
     }
     public static void automaticAnswer(){
         System.out.println("""
                 Automatic answer
                 1.Go back to Call settings""");
         userInput = input.nextInt();
         switch(userInput){
             case 1 -> callSettings();
         }
     }
     public static void phoneSettings(){
         System.out.println("""
                 Phone settings
                 1. Language
                 2. Cell info display
                 3. Welcome note
                 4. Network selection
                 5. Lights
                 6. Confirm SIM service actions""");
         userInput = input.nextInt();
         switch(userInput){
             case 1 -> language();
             case 2 -> cellInfoDisplay();
             case 3 -> welcomeNote();
             case 4 -> networkSelection();
             case 5 -> lights();
             case 6 -> comfirmSimServiceAction();
             case 7 -> settings();
         }
     }
     public static void language(){
         System.out.println("""
                 Language
                 1. Go back to Phone settings""");
         userInput = input.nextInt();
         switch(userInput){
             case 1 -> phoneSettings();
         }
     }
     public static void cellInfoDisplay(){
         System.out.println("""
                 Cell info display
                 1. Go back to Phone settings""");
         userInput = input.nextInt();
         switch(userInput){
             case 1 -> phoneSettings();
         }
     }
     public static void welcomeNote(){
         System.out.println("""
                 Welcome note
                 1. Go back to Phone settings""");
         userInput = input.nextInt();
         switch(userInput){
             case 1 -> phoneSettings();
         }
     }
     public static void networkSelection(){
         System.out.println("""
                 Network selection
                 1. Go back to Phone settings""");
         userInput = input.nextInt();
         switch(userInput){
         case 1 -> phoneSettings();
         }
     }
     public static void lights(){
         System.out.println("""
                 Lights
                 1. Go back to Phone settings""");
         userInput = input.nextInt();
         switch(userInput){
             case 1 -> phoneSettings();
         }
     }
     public static void comfirmSimServiceAction(){
         System.out.println("""
                 Comfirm SIM service actions
                 1. Go back to Phone settings""");
         userInput = input.nextInt();
         switch(userInput){
             case 1 -> phoneSettings();
         }
     }
    public static void securitySettings(){
        System.out.println("""
                Security settings
                1. PIN code request
                2. Call barring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access codes
                7. Go back to Settings""");
        userInput = input.nextInt();
        switch(userInput) {
            case 1 -> pinCodeRequest();
            case 2 -> callBarringService();
            case 3 -> fixedDialling();
            case 4 -> closedUserGroup();
            case 5 -> phoneSecurity();
            case 6 -> changeAccessCodes();
            case 7 -> settings();
        }
    }
    public static void pinCodeRequest(){
        System.out.println("""
                PIN code request
                1.  Go back to Security settings""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> securitySettings();
        }
    }
    public static void callBarringService(){
        System.out.println("""
                Call barring service
                1. Go back to Security settings""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> securitySettings();
        }
    }
    public static void fixedDialling(){
        System.out.println("""
                Fixed dialling
                1. Go back to Security settings""");
        userInput = input.nextInt();
            switch(userInput) {
                case 1 -> securitySettings();
            }
    }
    public static void closedUserGroup(){
        System.out.println("""
                Closed user group
                1. Go back to Security settings""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> securitySettings();
        }
    }
    public static void phoneSecurity(){
        System.out.println("""
                Phone security
                1. Go back to security settings""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> securitySettings();
        }
    }
    public static void changeAccessCodes(){
        System.out.println("""
                Change access code
                1. Go back to Security settings""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> securitySettings();
        }
    }
    public static void restoreFactorySettings(){
        System.out.println("""
                Restore refactory settings
                1. Go back to Settings""");
        userInput = input.nextInt();
        switch(userInput) {
            case 1 -> settings();
        }
    }
    public static void callDivert (){
        System.out.println("""
                Call divert
                1. Go back to Main menu""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> mainMenu();
        }
    }
    public static void games(){
        System.out.println("""
                Games
                1. Go back to Main menu""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> mainMenu();
        }
    }
    public static void calculator(){
        System.out.println("""
                Calculator
                1. Go back to Main menu""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> mainMenu();
        }
    }
    public static void reminders(){
        System.out.println("""
                Reminder
                1. Go back to Main menu""");
        userInput = input.nextInt();
        switch(userInput){
          case 1 -> mainMenu();
        }
    }
    public static void clock(){
        System.out.println("""
                Clocks
                1. Alarm clock
                2. Clock settings
                3. Date settings
                4. Stopwatch
                5. Countdown timer
                6. Auto update 
                7. Go back to Main menu""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> alarmClock();
            case 2 -> clockSettings();
            case 3 -> dateSettings();
            case 4 -> stopWatch();
            case 5 -> countdownTimer();
            case 6 -> autoUpdateOfDateAndTime();
            case 7 -> mainMenu();
        }
    }
    public static void alarmClock(){
        System.out.println("""
                Alarm clock
                1. Go back to Clock""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> clock();
        }
    }
    public static void clockSettings(){
        System.out.println("""
                Clock settings
                1. Go back to Clock""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> clock();
        }
    }
    public static void dateSettings(){
        System.out.println("""
                Date settings
                1. Go back to Clock""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> clock();
        }
    }
    public static void stopWatch(){
        System.out.println("""
                Stopwatch
                1. Go back to Clock""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> clock();
        }
    }
    public static void countdownTimer(){
        System.out.println("""
                Countdown timer
                1. Go back to Clock""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> clock();
        }
    }
    public static void autoUpdateOfDateAndTime(){
        System.out.println("""
                Auto update time and time""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> clock();
        }
    }
    public static void profiles(){
        System.out.println("""
                Profiles
                1. Go back to Main menu""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> mainMenu();
        }
    }
    private static void simService() {
        System.out.println("""
                SIM service
                1. Go baack to Main menu""");
        userInput = input.nextInt();
        switch(userInput){
            case 1 -> mainMenu();
        }
    }
}