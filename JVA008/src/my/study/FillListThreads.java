package my.study;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by red2 on 23.05.2016.
 */
public class FillListThreads {
    public static void main(String[] args) {
        System.out.println("FillListThreads ...");

    }
}

class MyBacket{
    List<Integer> innerlist;

    public MyBacket() {
        innerlist = new ArrayList<Integer>(100);
    }

//    public void add(List<T> list){
//        for(int i = 0; i<list.size();i++){
//
//        }

//    public void add(int element){
//
//    }
//    }
}

class MyTask implements  Runnable{
    List<Integer> srcList;
    List<Integer> dstList;
//    protected<T> maxValue;

    public MyTask(List<Integer> src, List<Integer> dst) {
        this.srcList = src;
        this.dstList = dst;
    }

    public Integer getMax(){
        Integer maxVal;
        if(srcList.size()>0) {
            maxVal = srcList.get(0);
            for (Integer i: srcList)
                if(Integer.compare(maxVal,i) < 0)
                    maxVal = i;
        }else maxVal = null;
        return maxVal;
    }
    @Override
    public void run() {

    }
}