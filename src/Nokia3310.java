import java.sql.SQLOutput;
import java.util.Scanner;
public class Nokia3310 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("press 1 for Phone book");
        System.out.println("press 2 for Messages ");
        System.out.println("press 3 Chat");
        System.out.println("press 4 for Call Register");
        System.out.println("press 5 for Tones");
        System.out.println("press 6 Settings");
        System.out.println("press 7 Call divert");
        System.out.println("press 8 Games");
        System.out.println("press 9 for Calculator");
        System.out.println("press 10 for Reminders");
        System.out.println("press 11 for Clocks");
        System.out.println("press 12 for Profiles");
        System.out.println("presss 13 for SIM services");

        String user = input.nextLine();
        switch (user) {
            case "1":
                System.out.println("Phone book");

                System.out.println("1.Search");
                System.out.println("2.Service Nos");
                System.out.println("3.Add name");
                System.out.println("4.Erase");
                System.out.println("5.Edit");
                System.out.println("6.Assign tone");
                System.out.println("7.Send b'card");
                System.out.println("8.Options");
                System.out.println("9.Speed dials");
                System.out.println("10.Voice");

                String search = input.nextLine();
                switch (search) {
                    case "1":
                        System.out.println("Search");

                }

                String serviceNos = input.nextLine();
                switch (serviceNos) {
                    case "2":
                        System.out.println("Add Name");
                }
                String addName = input.nextLine();
                switch (addName) {
                    case "3":
                        System.out.println("Add Name");
                }
                String erase = input.nextLine();
                switch (erase) {
                    case "4":
                        System.out.println("Erase");
                }
                String edit = input.nextLine();
                switch (edit) {
                    case "5":
                        System.out.println("Edit");
                }
                String assignTone = input.nextLine();
                switch (assignTone) {
                    case "6":
                        System.out.println("Assign tone");
                }
                String sendBcard = input.nextLine();
                switch (sendBcard) {
                    case "7":
                        System.out.println("Send b'card");
                }

                String Options = input.nextLine();
                switch (Options) {
                    case "8":
                        System.out.println("Options");

                        System.out.println("1.Type of view");
                        System.out.println("2.Memory status");
                }
                String speedDials = input.nextLine();
                switch (speedDials) {
                    case "9":
                        System.out.println("Speed Dials");
                }
                String voiceTags = input.nextLine();
                switch (voiceTags) {
                    case "10":
                        System.out.println("Voice Tags");
                }

            case "2":
                System.out.println("Messages");

                System.out.println("1.Write messages");
                System.out.println("2.Inbox");
                System.out.println("3.Outbox");
                System.out.println("4.Pictures");
                System.out.println("5.Tempelates");
                System.out.println("6.Smileys");
                System.out.println("7.Messages settings");
                System.out.println("8.Info service");
                System.out.println("9.Voice mailbox number");
                System.out.println("10.Service command editor");

                String writeMessages = input.nextLine();
                switch (writeMessages) {
                    case "1":
                        System.out.println("Write Messages");
                }
                String inbox = input.nextLine();
                switch (inbox) {
                    case "2":
                        System.out.println("Inbox");
                }
                String outbox = input.nextLine();
                switch (outbox) {
                    case "3":
                        System.out.println("Outbox");
                }
                String pictureMessages = input.nextLine();
                switch (pictureMessages) {
                    case "4":
                        System.out.println("Picture Messages");
                }
                String templates = input.nextLine();
                switch (templates) {
                    case "5":
                        System.out.println("Templates");
                }
                String smileys = input.nextLine();
                switch (smileys) {
                    case "6":
                        System.out.println("Smileys");
                }
                String messagesSettings = input.nextLine();
                switch (messagesSettings) {
                    case "7":
                        System.out.println("Messages Settings");
                        System.out.println("1.Set");
                        System.out.println("2.Common");

                        String set = input.nextLine();
                        switch (set) {
                            case "1":
                                System.out.println("1.Messages centre number");
                                System.out.println("2.Messages sent as");
                                System.out.println("3.Messages validity");

                                String messageCentreNumber = input.nextLine();
                                switch ("messageCentreNumber") {
                                    case "1.":
                                        System.out.println("Meesages Centre Number");
                                }
                                String messagesSentAs = input.nextLine();
                                switch (messagesSentAs) {
                                    case "2":
                                        System.out.println("Messages Sent As");
                                }
                                String messagesValidity = input.nextLine();
                                switch (messagesValidity) {
                                    case "3":
                                        System.out.println("Message Validity");
                                }
                        }
                        String common = input.nextLine();
                        switch (common) {
                            case "2":
                                System.out.println("Common");
                                System.out.println("1.Delivery reports");
                                System.out.println("2.Reply via same centre");
                                System.out.println("3.Character support");

                                String deliveryReports = input.nextLine();
                                switch (deliveryReports) {
                                    case "1":
                                        System.out.println("Delivery Reports ");
                                }
                                String replyViaSameCentre = input.nextLine();
                                switch (replyViaSameCentre) {
                                    case "2":
                                        System.out.println("Reply Via Same Centre");
                                }
                                String characterSupport = input.nextLine();
                                switch (characterSupport) {
                                    case "3":
                                        System.out.println("Character Support");
                                }
                        }
                        String infoService = input.nextLine();
                        switch (infoService) {
                            case "8":
                                System.out.println("Info Service");
                        }
                        String voiceMailboxNumber = input.next();
                        switch (voiceMailboxNumber) {
                            case "9":
                                System.out.println("Voice Mailbox number");
                        }
                        String serviceCommandEditor = input.nextLine();
                        switch ("serviceCommandEditor") {
                            case "10":
                                System.out.println("Service command editor");
                        }
                }
                String chat = input.nextLine();
                switch (chat) {
                    case "3":
                        System.out.println("Chat");
                }
                String callRegister = input.nextLine();
                switch (callRegister) {
                    case "4":
                        System.out.println("Call Register");

                        System.out.println("1.Missed Calls");
                        System.out.println("2.Received Calls");
                        System.out.println("3.Dialled numbers");
                        System.out.println("4.Erased recent call duration");
                        System.out.println("5.Show call duration");
                        System.out.println("6.Show call cost");
                        System.out.println("7.Call costs");
                        System.out.println("8.Prepaid credit");

                        String missedCalls = input.nextLine();
                        switch (missedCalls) {
                            case "1":
                                System.out.println("Missed Calls");
                        }
                        String receivedCalls = input.nextLine();
                        switch (receivedCalls) {
                            case "2":
                                System.out.println("Received Calls");
                        }
                        String dialledNumbers = input.nextLine();
                        switch (dialledNumbers) {
                            case "3":
                                System.out.println("Dialled Numbers");
                        }
                        String eraseRecentCallList = input.nextLine();
                        switch (eraseRecentCallList) {
                            case "4":
                                System.out.println("Erase Call List");
                        }

                        String showCallDuration = input.nextLine();
                        switch (showCallDuration) {
                            case "5":
                                System.out.println("Show Call Duration");

                                System.out.println("1.Last Call Duration");
                                System.out.println("2.All calls'duration");
                                System.out.println("3.Received calls'duration");
                                System.out.println("4.Dialled Calls'duration");
                                System.out.println("5.Clear timer");

                                String lastCallDuration = input.nextLine();
                                switch (lastCallDuration) {
                                    case "1":
                                        System.out.println("Last Call Duration");
                                }

                                String allCallDuration = input.nextLine();
                                switch (allCallDuration) {
                                    case "2":
                                        System.out.println("All Calls' Duration");
                                }
                                String receivedCallsDuration = input.nextLine();
                                switch (receivedCallsDuration) {
                                    case "3":
                                        System.out.println("Received Calls'duration");
                                }
                                String dialledCallsDuration = input.nextLine();
                                switch (dialledCallsDuration) {
                                    case "4":
                                        System.out.println("Dialled Calls'duration");
                                }
                                String clearTimers = input.nextLine();
                                switch (clearTimers) {
                                    case "5":
                                        System.out.println("Clear timers");
                                }
                        }
                        String showCallCosts = input.nextLine();
                        switch (showCallCosts) {
                            case "6":
                                System.out.println("Show Call Costs");

                                System.out.println("Last Call Cost");
                                System.out.println("All Call Cost ");
                                System.out.println("Clear Counters");

                                String lastCallCost = input.nextLine();
                                switch (lastCallCost) {
                                    case "1":
                                        System.out.println("Last Call Cost");
                                }
                                String allCallCost = input.nextLine();
                                switch (allCallCost) {
                                    case "2":
                                        System.out.println("All Calls'cost");
                                }
                                String clearCounters = input.nextLine();
                                switch (clearCounters) {
                                    case "3":
                                        System.out.println("Clear Counters");
                                }
                        }
                        String callCostSettings = input.nextLine();
                        switch (callCostSettings) {
                            case "7":
                                System.out.println("Call Cost Setting");

                                System.out.println("1.Call cost limit ");
                                System.out.println("2. Show costs in");
                                String callCostSetting = input.nextLine();
                                switch (callCostSetting) {
                                    case "1":
                                        System.out.println("Call Cost Limit");
                                }
                                String showCostIn = input.nextLine();
                                switch (showCostIn) {
                                    case "2":
                                        System.out.println("Show Cost In");
                                }
                        }
                        String prepaidCredit = input.nextLine();
                        switch (prepaidCredit) {
                            case "8":
                                System.out.println("Prepaid Credit");
                        }
                }
          String tones = input.nextLine();
                switch(tones){
                    case"5":
                        System.out.println("Tones");

                        System.out.println("1.Ringing tone");
                        System.out.println("2.Ringing Volume");
                        System.out.println("3.Incoming call alert");
                        System.out.println("4.Composer");
                        System.out.println("5.Message alert tone");
                        System.out.println("6.Keypad tone");
                        System.out.println("7.Warning and game tones");
                        System.out.println("8.Vibrating alert");
                        System.out.println("9.Screen saver");

                        String ringingtone = input.nextLine();
                        switch(ringingtone){
                            case"1":
                                System.out.println("Ringing Tone");
                        }
                       String ringingvolume = input.nextLine();
                        switch(ringingvolume){
                            case"2":
                                System.out.println("Ringing Volume");
                        }
                        String incomingcallalert = input.nextLine();
                        switch(incomingcallalert){
                            case"3":
                                System.out.println("Incoming Call Alert");
                        }
                        String composer = input.nextLine();
                        switch(composer){
                            case"4":
                                System.out.println("Composer");
                        }
                        String messagecallalert = input.nextLine();
                        switch(messagecallalert){
                            case"5":
                                System.out.println("Message Call Alert");
                        }
                        String keypadtones = input.nextLine();
                        switch(keypadtones){
                            case"6":
                                System.out.println("Keypad Tones");
                        }
                        String warningandgametone = input.nextLine();
                        switch(warningandgametone){
                            case"7":
                                System.out.println("Warning and games tones");
                        }
                        String vibratingalert = input.nextLine();
                        switch(vibratingalert){
                            case"8":
                                System.out.println("Vbrating alert");
                        }
                        String screensaver = input.nextLine();
                        switch(screensaver){
                            case"9":
                                System.out.println("Screen Saver");
                        }
                }
                String setting = input.nextLine();
                switch(setting){

                    case"6":
                        System.out.println("Setting");

                        System.out.println("1.Call settings");
                        System.out.println("2.Phone Settings");
                        System.out.println("3.Security settings");
                        System.out.println("4.Restore factory");

                  String  callsetting = input.nextLine();
                  switch(callsetting) {
                      case "1":
                          System.out.println("Call Setting");

                          System.out.println("1.Automatic redial");
                          System.out.println("2.Speed dialling");
                          System.out.println("3.Call waiting options");
                          System.out.println("4.Own number sending");
                          System.out.println("5.Phone line in use");
                          System.out.println("6.Automatic anwser");

                          String automaticredial = input.nextLine();
                          switch (automaticredial) {
                              case "1":
                                  System.out.println("Automatic redial");
                          }

                          String speeddialling = input.nextLine();
                          switch (speeddialling) {
                              case "2":
                                  System.out.println("Speed dialling");
                          }

                          String callwaitingoption = input.nextLine();
                          switch (callwaitingoption) {
                              case "3":
                                  System.out.println("Call Waiting options");
                          }

                          String ownnumbersending = input.nextLine();
                          switch (ownnumbersending) {
                              case "4":
                                  System.out.println("Own number sending");
                          }

                          String phonelineinuse = input.nextLine();
                          switch (phonelineinuse) {
                              case "5":
                                  System.out.println("Phone line in use");
                          }
                          String automaticanswer = input.nextLine();
                          switch (automaticanswer) {
                              case "6":
                                  System.out.println("Automatic answer");
                          }
                  }

                  String phonesettings = input.nextLine();
                      switch(phonesettings){

                          case"2":
                              System.out.println("Phone Setting");

                              System.out.println("1.Language");
                              System.out.println("2.Cell info display");
                              System.out.println("3.Welcome note");
                              System.out.println("4.Network selection");
                              System.out.println("5.Lights");
                              System.out.println("6.Comfirm SIM service actions");

                              String language = input.nextLine();
                              switch(language){
                                  case"1":
                                  System.out.println("Language");
                              }

                              String cellinfodisplay = input.nextLine();
                             switch(cellinfodisplay){
                                 case"2":
                                     System.out.println("Cell info display");
                             }

                             String welcomenote = input.nextLine();
                             switch(welcomenote){
                                 case"3":
                                     System.out.println("Welcome Note");
                             }

                             String networkselection = input.nextLine();
                             switch(networkselection){
                                 case"4":
                                     System.out.println("Network selection");
                             }

                             String lights = input.nextLine();
                             switch(lights){
                                 case"5":
                                     System.out.println("Lights");
                             }

                             String comfirmsimserviceactions = input.nextLine();
                             switch(comfirmsimserviceactions){
                                 case"6":
                                     System.out.println();
                             }
                      }
             String securitysettings = input.nextLine();
                      switch(securitysettings) {
                          case "3":
                              System.out.println("Security settings");

                              System.out.println("1.PIN code request");
                              System.out.println("2.Call barring service");
                              System.out.println("3.Fixed dialling");
                              System.out.println("4.Closed user group");
                              System.out.println("5.Phone security");
                              System.out.println("6.Change access settings");

                              String pincoderequest = input.nextLine();
                              switch (pincoderequest) {
                                  case "1":
                                      System.out.println("PIN code request");
                              }

                              String callbarringservice = input.nextLine();
                              switch (callbarringservice) {
                                  case "2":
                                      System.out.println("Call barring service");
                              }

                              String fixeddialling = input.nextLine();
                              switch (fixeddialling) {
                                  case "3":
                                      System.out.println("Fixed dialling");
                              }

                              String closedusergroup = input.nextLine();
                              switch (closedusergroup) {
                                  case "4":
                                      System.out.println("Closed user group");
                              }

                              String phonesecurity = input.nextLine();
                              switch (phonesecurity) {
                                  case "5":
                                      System.out.println("Phone security");
                              }

                              String changeaccesscodes = input.nextLine();
                              switch (changeaccesscodes) {
                                  case "6":
                                      System.out.println("Change access codes");
                              }
                      }
                      String refactorefactorysettings = input.nextLine();
                      switch(refactorefactorysettings){
                          case"6":
                              System.out.println("Refactore factory settings");
                      }
                }
                    String calldivert = input.nextLine();
                switch(calldivert){
                    case"7":
                        System.out.println("Call divert");
                }

                String games = input.nextLine();
                switch(games){
                    case"8":
                        System.out.println("Games");
                }

                String calculator = input.nextLine();
                switch(calculator){
                    case"9":
                        System.out.println("Calculator");
                }

                String reminder = input.nextLine();
                switch(reminder){
                    case"10":
                        System.out.println("Reminder");
                }

           String clock = input.nextLine();
                switch(clock){
                    case"11":
                        System.out.println("Clock");

                        System.out.println("1.Alarm clock");
                        System.out.println("2.Clock settings");
                        System.out.println("3.Date setting ");
                        System.out.println("4.stopatch");
                        System.out.println("5.Countdown timer");
                        System.out.println("6.Auto update of date and time");

                        String alarmclock = input.nextLine();
                        switch(alarmclock){
                            case"1":
                                System.out.println("Alarm clock");
                        }

                        String clocksettings = input.nextLine();
                        switch(clocksettings){
                            case"2":
                                System.out.println("Clock settings");
                        }

                        String datesettings = input.nextLine();
                        switch(datesettings){
                            case"3":
                                System.out.println("Date settings");
                        }

                        String stopwatch = input.nextLine();
                        switch(stopwatch){
                            case"4":
                                System.out.println("Stopwatch");
                        }

                        String countdowntimer = input.nextLine();
                        switch(countdowntimer){
                            case"5":
                                System.out.println("Countdownn timer");
                        }

                        String autoupdateofdateandtime = input.nextLine();
                        switch (autoupdateofdateandtime){
                            case"6":
                                System.out.println(" Auto update of date and time");
                        }
                }

                String profiles = input.nextLine();
                switch(profiles){
                    case"12":
                        System.out.println("Profiles");
                }

                String simservices = input.nextLine();                switch(simservices){
                    case"13":
                        System.out.println("SIM service");
                }



        }


    }

}

