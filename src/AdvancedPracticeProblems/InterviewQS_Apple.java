package src.AdvancedPracticeProblems;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class InterviewQS_Apple {

    public static void main(String s1[]) {
        //int s[]={2,8,7,6,5};
//        List<Integer> lst=new ArrayList<Integer>();
//        //lst=Arrays.asList(s);
//        lst.add(2);
//        lst.add(8);
//        lst.add(6);
//        lst.add(9);
//        lst.add(5);
//
//        List<Integer> outputList=new ArrayList<>();
//        outputList=  lst.stream().map(s->s+10).collect(Collectors.toList());
//        System.out.println(outputList);


        //input I am a string

        //output g ni r tsamaI

//        String str="I am a string";
//        String reverse=reverseString(str);
//        reverse=reverse.replaceAll(" ","");
//        System.out.println(reverse);
//        String output="";
//        for(int i=0,k=0;i<str.length()&&k<reverse.length();i++)
//        {
//            if(str.charAt(i)==' ')
//            {
//                output=output+" ";
//            }
//            else
//            {
//                output=output+reverse.charAt(k++);
//            }
//
//        }
//        System.out.println(output);


        File file = new File("solrUIAutomation/src/main/resources");

        System.out.println(getFile(file).getName());

//
//        WebDriver driver=new ChromeDriver();
//        driver.get("httpsgoogle.com");
//
//        WebElement ele=driver.findElement(By.xpath("xpath"));
//        WebDriverWait wait=new WebDriverWait(driver,20);
//
//        wait.pollingEvery(Duration.ofSeconds(2)).until(ele.getText(),true);
//
//        Function f;
//        f.apply(ele.);


//
//        JavascriptExecutor js=(driver)JavascriptExecutor;
//        js.executeScript("retrun document.getElementById(""id"));

//        age,name
//                sort the objects in descending order of age and print the student names;

        HashMap<String, Integer> hm = new HashMap();
        List<HashMap<String, Integer>> lst = new ArrayList<HashMap<String, Integer>>();


        // Collections.sort(lst,Comparator.naturalOrder().compare(T1,T2));

        Set set = hm.keySet();
        Iterator itr = set.iterator();
        //set.stream().sorted(Comparator.reverseOrder());

        //set.stream().sorted();
        int arr[] = new int[set.size()];
        for (int i = 0; i < set.size(); i++) {
            //String str=itr.next();
            arr[i] = hm.get(itr.next());
        }

        //4,3,6,7
        for (int i = 0; i < set.size(); i++) {
            for (int j = i + 1; j < set.size(); i++) {
                if (arr[i] < arr[j]) {
                    //Swap(arr[i],<arr[j]);

                    //arr[i]=
                }
            }
            // Chrome

        }


    }

    public static File getFile(File file) {

        if (file.isDirectory()) {

            File files[] = file.listFiles();
            Arrays.stream(files).map(s -> getFile(s)).collect(Collectors.toList())
                    .forEach(s -> System.out.println(s.getName()));
        }

//        List<String>lst1=new ArrayList<>();
//
//        StreamSupport.stream(lst1.spliterator(),true).

        return file;

    }

    public static String reverseString(String str) {
        int n = str.length();

        if (n > 1) {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
        return str;
    }

    public void Swap(int a, int b) {

    }


}
