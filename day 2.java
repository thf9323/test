import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("삼각형의 넓이를 구합니다.");
    System.out.print("밑변:");
    double x = stdIn.nextDouble();
    System.out.print("높이:");
    double y = stdIn.nextDouble();

    System.out.println("넓이는"+((x * y)/2)+ "입니다.");

    
    ///////////////////////////////////////////////////////////////////////////
    // Scanner stdIn = new Scanner(System.in);
    // System.out.print("x값:");
    // double x = stdIn.nextDouble();
    // System.out.print("y값:");
    // double y = stdIn.nextDouble();

    // System.out.println("합계는 :" + ( x + y )+"입니다.");
    // System.out.println("평균은 :" + (( x + y )/2)+"입니다.");
    ///////////////////////////////////////////////////////////////////////////
    // Scanner stdIn = new Scanner(System.in);
    // System.out.println("정수값 :");
    // int x = stdIn.nextInt();
    // System.out.println("마지막 수를 제외한 값은"+(x/10)+"입니다.");
    // System.out.println("마지막 자릿수는"+(x%10)+"입니다.");
  }
}
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("당신의 주민번호를 입력해주세요 : ");
String num = scanner.nextLine();
char gender = num.charAt(7);
switch (gender) {
case '1' :
System.out.print("당신은 2000년 이전에 출생한 남자입니다");
break;
case '2' :
System.out.print("당신은 2000년 이전에 출생한 여자입니다");
break;
case '3' :
System.out.print("당신은 2000년 이후에 출생한 남자입니다");
break;
case '4' :
System.out.print("당신은 2000년 이전에 출생한 여자입니다");
break;
default:
System.out.println("잘못입력하셨습니다");
}
        /*Scanner scanner = new Scanner(System.in);
     System.out.println("주민번호를 입력하세요 : ");

    String num = scanner.nextLine();
    char gender = num.charAt(7);
    switch(gender) {
      case '1': case '3':
        System.out.println("당신은 남성입니다.");
        break;
      case '2': case '4':
        System.out.println("당신은 여성입니다.");
        break;
      default:
        System.out.println("잘못 입력하셨습니다.");
    }*/
     
//     System.out.print("당신의 점수를 입력하세요.(1~100)>");
// int score = scanner.nextInt();

// switch(score/10) {
//   case 9: case 10:
//     System.out.println("당신의 학점은 A입니다.");
//     break;
//   case 8:
//     System.out.println("당신의 학점은 B입니다.");
//     break;
//   case 7:
//     System.out.println("당신의 학점은 C입니다.");
//     break;
//   case 6:
//     System.out.println("당신의 학점은 F입니다.");
//     break;
// }
    
      
    

    // if (score >=12){
    //   grade = "겨울";
    // }
    // else if (score >=9){
    //   grade = "가을";
    // }
    // else if (score >=6){
    //   grade = "여름";
    // }
    // else if (score >=3){
    //   grade = "봄";
    // }
    // else if(score >=1){
    //   grade = "겨울";
    // }
    // System.out.printf("현재계절은 %s 입니다.", grade);

    
    
    /////////////////////////////////////////////////////////////////////
    /*Scanner scanner = new Scanner(System.in);
     System.out.println("주민번호를 입력하세요 : ");

    String num = scanner.nextLine();
    char gender = num.charAt(7);
    switch(gender) {
      case '1': case '3':
        System.out.println("당신은 남성입니다.");
        break;
      case '2': case '4':
        System.out.println("당신은 여성입니다.");
        break;
      default:
        System.out.println("잘못 입력하셨습니다.");
    }*/
    ////////////////////////////------계절--------////////////////////////////////////////////////////
   /* int month = 0;
    String grade = " ";
  
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("현재 월을 입력하세요 : ");
    month = scanner.nextInt();
   
     switch (month){
       case 12:
       case 1 :
       case 2 :
         System.out.println("현재 계절은 겨울입니다.");
           break;
         case 3 :
         case 4 :
         case 5 :
         System.out.println("현재 계절은 봄입니다.");
           break;
         case 6 :
         case 7 :
         case 8 :
         System.out.println("현재 계절은 여름입니다.");
           break;
         case 9 :
         case 10 :
         case 11 :
         System.out.println("현재 계절은 가을입니다.");
           break;

         
       
     }
*/
   
    //System.out.printf("현재계절은 %s 입니다.", grade);



    
    // int score = 0;
    // String grade = " ";
  
    // Scanner scanner = new Scanner(System.in);
    
    // System.out.print("현재 월을 입력하세요 : ");
    // score = scanner.nextInt();
   

    // if (score >=12){
    //   grade = "겨울";
    // }
    // else if (score >=9){
    //   grade = "가을";
    // }
    // else if (score >=6){
    //   grade = "여름";
    // }
    // else if (score >=3){
    //   grade = "봄";
    // }
    // else if(score >=1){
    //   grade = "겨울";
    // }
    // System.out.printf("현재계절은 %s 입니다.", grade);



    
/////////////////////---- 학점 구하기 +, -, 0 -----////////////////////////////////////////////
   /* int score = 0;
    char grade = ' ';
    char opt = ' ';
    
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("점수를 입력하세요 : ");
    score = scanner.nextInt();
    //System.out.print("당신의 점수는"+ score +"입니다. ");
    System.out.printf("당신의 점수는 %d%n점 입니다.",score);

    if (score >= 90){
      grade = 'a';
    }
    //   if (score >= 98){
    //     opt = '+';
    //   }
    //   else if(score >= 94){
    //     opt = '0';
    // }
    //     else{
    //       opt = '-';
    //     }
    else if(score >= 80) {
         grade = 'b';
    }
    else if(score >= 70) {
         grade = 'c';
    }
    else {
         grade = 'd';
    }
    
    if (score >= 9){
        opt = '+';
      }
      else if(score >= 9){
        opt = '0';
    }
        else{
          opt = '-';
        }
    System.out.printf("당신의 학점은 %c%c입니다.",grade,opt);
    
    */
    

    
    ///////////////////////////////--------////////////////////////////////
    /*int score = 0;
    char grade = ' ';
    
     System.out.print("숫자를 입력하세요.:");
     Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();  
    
        if(score >= 90) {
         grade = 'a';}
           
        else if(score >= 90) {
         grade = 'b';}
           
        else if(score >= 90) {
         grade = 'c';}
            
        else {
         grade = 'd';}
    System.out.println("당신의 점수는"+score+"입니다. ");
    System.out.println("당신의 학정은"+grade+"입니다. ");*/
    
    ///////////////////////////////---학점 알아보기---///////////////////////////////
    // System.out.print("숫자를 입력하세요.:");
    // Scanner scanner = new Scanner(System.in);
    //   int input = scanner.nextInt();
    //  if(input >= 90) {
    //     System.out.println("점수가 90보다 크다면 a학점.");
    //  }
    //    else if(input >= 80){
    //    System.out.println("점수가 80보다 크다면 b학점.");}
    //   else if(input >= 70){
    //    System.out.println("점수가 70보다 크다면 c학점.");}
    //    else{
    //    System.out.println("나머지는 d학점.");}
 
    ////////////////////////////////////////////////////////////////////
     //Scanner stdIn = new Scanner(System.in);
    // System.out.print("숫자를 하나 입력하세요.:");
    // Scanner scanner = new Scanner(System.in);
    // int input = scanner.nextInt();
    // if( input % 3 == 0){
    //   System.out.println("입력하신 숫자는 3의 배수 입니다.");
    // }
    // else{
    //   System.out.println("입력하신 숫자는 3의 배수가 아닙니다.");
    // }
    ///////////////////////////////////////////////////////////////////////
    // System.out.print("숫자를 하나 입력하세요.:");
    // Scanner scanner = new Scanner(System.in);
    // int input = scanner.nextInt();
    // if( input % 2 == 0){
    //   System.out.println("입력하신 숫자는 짝수 입니다.");
    // }
    // else{
    //   System.out.println("입력하신 숫자는 홀수 입니다.");
    // }
    
    

    /////////////////////////////////////////////////////////////////////////
    //     int input;

//     System.out.print("숫자를 하나 입력하세요.>");
// Scanner scanner = new Scanner(System.in) ;
// String tmp = scanner.nextLine();
// input = Integer.parseInt(tmp);

// if(input==0) {
//   System.out.println("입력하신 숫자는 0입니다.");
// }
// if(input!=0) {
//   System.out.println("입력하신 숫자는 0이 아닙니다.");
//   System.out.printf("입력하신 숫자는 %d입니다.", input);
// }
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // int x = 0; //정수형 변수 x 에 초기값 0을 대입
    //   System.out.printf("x=%d 일 때, 참인 것은%n",x); // %d 자리표시자  d 
    // if(x== 0) System.out.println("x==0");
    // if(x!=0) System.out.println("x! = 0");
    // if(!(x==0)) System.out.println("!(x==0)");
    // if(!(x!=0)) System.out.println("!(x!=0)");

    


    // x = 1;
    // System.out.printf("x=%d 일 때, 참인 것은 %n",x);
    // if (x== 0) System.out.println("x==0");
    // if (x!=0) System.out.println("x! = 0");
    // if (!(x==0)) System.out.println("!(x==0)");
    // if(!(x!=0)) System.out.println("!(x!=0)");
  
    
    
    ////////////////////////////////////////////////////////////////////////// 
    // Scanner stdIn = new Scanner(System.in);
    // System.out.println("삼각형의 넓이를 구합니다.");
    // System.out.print("밑변:");
    // double x = stdIn.nextDouble();
    // System.out.print("높이:");
    // double y = stdIn.nextDouble();
    // System.out.println("넓이는"+((x * y)/2)+ "입니다.");
    ///////////////////////////////////////////////////////////////////////////
    // Scanner stdIn = new Scanner(System.in);
    // System.out.print("x값:");
    // double x = stdIn.nextDouble();
    // System.out.print("y값:");
    // double y = stdIn.nextDouble();

    // System.out.println("합계는 :" + ( x + y )+"입니다.");
    // System.out.println("평균은 :" + (( x + y )/2)+"입니다.");
    ///////////////////////////////////////////////////////////////////////////
    // Scanner stdIn = new Scanner(System.in);
    // System.out.println("정수값 :");
    // int x = stdIn.nextInt();
    // System.out.println("마지막 수를 제외한 값은"+(x/10)+"입니다.");
    // System.out.println("마지막 자릿수는"+(x%10)+"입니다.");
  }
}
