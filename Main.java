import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ---- 1 ----

//        String ar[] = { "cat", "dog", "red", "is", "am" };
//        ArrayList newAr = new ArrayList();
//        int max = 0 ;
//        for(int i = 0 ; i<ar.length;i++){
//            if(ar[i].length()>max) max = ar[i].length();
//        }
//
//        for(int i = 0 ; i <ar.length; i++){
//            if(ar[i].length()==max) newAr.add(ar[i]);
//        }
//
//        System.out.println(newAr);

        // ---- 2 ----

//        try{
//            int [] ar = {1,1,1,3,3,5};
//            System.out.println("Enter a number: ");
//            int num = scan.nextInt();
//            int count = 0 ;
//            for(int i = 0; i<ar.length;i++){
//                if(num == ar[i]) count++;
//            }
//            System.out.printf("%d occurs %d times",num,count);
//        } catch (InputMismatchException e){
//            System.out.println("Write a number please");
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        // ---- 3 ----

//            try{
//                int [] ar = {1, 4, 17, 7, 25, 3, 100};
//                System.out.println("Enter k:");
//                int k = scan.nextInt();
//                checkNumber(k,ar.length);
//                Arrays.sort(ar);
//                ArrayList newAr = new ArrayList<>();
//                int j =0;
//                for(int i = ar.length-1; i>=k-ar.length;i--) {
//                    if(k==j) break;
//                    newAr.add(ar[i]);
//                    j++;
//                }
//                System.out.print(k+" larges elements of the said array are: "+newAr);
//            } catch (InputMismatchException e){
//                System.out.println("Write a number.");
//            } catch (Exception e){
//                System.out.println(e);
//            }


        // ---- 4 ----


//        int ar [] = {5,4,3,2,1};
//
//        System.out.println(Arrays.toString(reverse(ar)));

        // ---- 5 ----

//        System.out.println("Enter the size of array:");
//        int len = scan.nextInt();
//        int [] ar = new int[len];
//
//
//        int num;
//        do{
//
//            System.out.println("1. Accept elements of an array\n2. Display elements of an array \n3. Search the element within array\n4. Sort the array\n5. To Stop");
//            num = scan.nextInt();
//            if(num == 1){
//                for(int i = 0 ; i<len;i++){
//
//                    try{
//                        System.out.println("Enter element "+i);
//                        ar[i]=scan.nextInt();
//                    }catch(InputMismatchException e){
//                        System.out.println("Write a number");
//                    } catch(Exception e){
//                        System.out.println(e.getMessage());
//                    }
//
//                }
//            }else if(num == 2){
//                System.out.println(Arrays.toString(ar));
//            }else if(num == 3){
//                System.out.println("Enter the element");
//                int element= scan.nextInt();
//                int index =-1;
//                for(int i =0 ; i<len;i++){
//                    if(ar[i]== element) {
//                        System.out.println(element+" is in "+i);
//                    break;
//                    }
//                }
//            }else if(num == 4){
//                Arrays.sort(ar);
//                System.out.println(Arrays.toString(ar));
//            }else continue;
//        }while(!(num==5));


        // ---- 6 ----


//        try{
//
//            System.out.println("Enter the minimum value of the range:");
//            int min = scan.nextInt();
//            System.out.println("Enter the maximum value of the range:");
//            int max= scan.nextInt();
//            System.out.println("Enter the number of random numbers to generate:");
//            int num = scan.nextInt();
//            System.out.println("Random numbers within the specified range: "+gen(min,max,num));
//
//
//        } catch (InputMismatchException e){
//            System.out.println("Write a number");
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        // ---- 7 ----

//        System.out.println("Enter a password:");
//        String pass = scan.next();
//        System.out.println(passCheck(pass));

        // ---- 8 ----

//        System.out.println(fib(10));

    }


    public  static  void checkNumber(int a ,int len) throws Exception{
        try {
            if(a>len){
                throw new Exception("the number is bigger than the length");
            }
            if(a<0){
                throw new Exception("Write a positive number.");
            }
        } catch (InputMismatchException e){
            System.out.println("Write a number");
        }
    }


    public  static int [] reverse (int ar []){
        int len = ar.length-1;
        int half = len/2;

        for(int i = len;i>=0 ; i--){
            int t = ar[i];
            ar[i]=ar[len-i];
            ar[len-i] = t;

            if((ar.length%2==0 && i== half+1)||(ar.length%2!=0 && i == half)) break;

        }
        return  ar;
    }
    public static String gen(int min , int max , int elm){
        String str = "";
        Random rand =new Random();
        for(int i = 0; i<5 ; i++){
            int number = rand.nextInt(max - min + 1)+min;
            str+= number+" ";
        }
        return str;
    }

    public  static String fib(int k){
        String str = "";
        int [] ar = new int[k];
        ar[0] = 0;
        ar[1]=1;
        for(int i = 2 ; i<k;i++){
            ar[i]= ar[i-1]+ar[i-2];

        }
        for(int i = 0 ; i<ar.length;i++) str+=ar[i]+" ";;
        return str;

    }

    public static String passCheck(String pass){
        int point = 0;
        int len = pass.length();

        point += checkLength(pass);
        point += checkSpecialCharacters(pass);
        point += checkUpperCaseLowerCase(pass);

        if(point>=8) return "Password is strong";
        else if(point<8 &&point>=5) return  "Password is moderate";
        else return "Password is weak";
    }

    public  static  int checkLength(String pass){
        if(pass.length()>= 8) return 3;
        else if(pass.length()<=7 && pass.length()>=6) return 2;
        else  return 0;
    }

    public static int checkSpecialCharacters(String pass){
        Pattern special = Pattern.compile("[@%!$&#?]");
        Matcher specialCheck = special.matcher(pass);
        if(specialCheck.find()) return 2;
        else return 0;
    }
    public  static  int checkUpperCaseLowerCase(String pass){
        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern lowerCase = Pattern.compile("[a-z]");
        Matcher upperCheck = upperCase.matcher(pass);
        Matcher lowerCheck = lowerCase.matcher(pass);
        if(upperCheck.find() && lowerCheck.find()) return 3;
        else  return 0;
    }
}