package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DialPadProgram {

    public static void main(String[] args) {
        DialPadProgram dp = new DialPadProgram();
        dp.solveMeFirst();
        //dp.createDialpad();
    }


    List<List<Integer>> vec = new ArrayList<List<Integer>>();

    List<String> results = new ArrayList<>();

    void solve(int i, String s){
        s += i + "";
        if(s.length() == 10){
            results.add(s);
            return;
        }
        for(int j = 0; j < vec.get(i).size(); j++) {
            solve(vec.get(i).get(j), s);
        }
    }

    void solveMeFirst() {
//        for(int i = 1; i <= 9; i++){
//            for(int j = i+1; j <= 9; j++){
//                int row1 = (i-1)/3;
//                int col1 = (i-1)%3;
//                int row2 = (j-1)/3;
//                int col2 = (j-1)%3;
//                if(row1 == row2 || col1 == col2){
//                    vec.get(i).add(j);
//                    vec.get(j).add(i);
//                } } }
//        vec.add(0).add(2);vec.get(2).add(0);
//        vec.get(0).add(5);vec.get(5).add(0);
//        vec.get(0).add(8); vec.get(8).add(0);
//        String [] arr = {"258","2347","13580","1269","5617","46280","4539","8914","79250","7836"};
       // number possibilities when u are at 0
        vec.add(Arrays.asList(2,5,8));
        vec.add(Arrays.asList(2,3,4,7));
        vec.add(Arrays.asList(1,3,5,8,0));
        vec.add(Arrays.asList(1,2,6,9));
        vec.add(Arrays.asList(5,6,1,7));
        vec.add(Arrays.asList(4,6,2,8,0));
        vec.add(Arrays.asList(4,5,3,9));
        vec.add(Arrays.asList(8,9,1,4));
        vec.add(Arrays.asList(7,9,2,5,0));
        vec.add(Arrays.asList(7,8,3,6));
        String s = "";
        for(int i = 1; i <= 9; i++){
            solve(i, s);
        }
        System.out.println("nummber of elements : "+ results.size());
        for(int i = 0; i < results.size(); i++){
            System.out.println(results.get(i));
        }
    }

    public void createDialpad()
    {
        List<List<Integer>> vec1 = new ArrayList<List<Integer>>();
        for(int i = 1; i <= 9; i++){
            for(int j = i+1; j <= 9; j++){
                int row1 = (i-1)/3;
                int col1 = (i-1)%3;
                int row2 = (j-1)/3;
                int col2 = (j-1)%3;
                if(row1 == row2 || col1 == col2){
                    vec1.get(i).add(j);
                    vec1.get(j).add(i);
                } } }
        System.out.println(vec1);
//        vec.get(0).add(2);vec.get(2).add(0);
//        vec.get(0).add(5);vec.get(5).add(0);
//        vec.get(0).add(8); vec.get(8).add(0);
    }



}