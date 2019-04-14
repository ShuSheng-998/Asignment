import java.util.ArrayList;

public class pink {
    private char[] Information;//创建此信息的字符串数组
    private  int number;//对此信息的添加或删除做记录
    ArrayList<pink> real = new ArrayList<>() ;//新建数组列表以增加字符信息

    public pink(char[]IN) {//构造器赋值
        this.Information=IN;
        this.number=0;

    }
    public void addInformation (char[]IN){
        real.add(new pink(IN));//新增信息到数组列表中
        number++;//信息添加 1
    }
    public void GetInformation() {//获得信息分3种情况
        if(number==0){//刚开使使用此信息，未进行任何改动或添加
        this.real.add(new pink(this.Information));
        System.out.print(this.real.get(0).Information);
        }
        if(number>0) {//添加过信息后的输出信息方法
           for(int i=0;i<=number;i++){
               System.out.print(this.real.get(i).Information);
           }
        }
        if(number<0)//改变所有信息后，获得信息的方法
            System.out.println(this.real.get(0).Information);
        System.out.println();
    }

    public void ChangeInformation(char[] IN) {//改变信息
       number=-1;
        real.set(0,new pink(IN));
    }

    public void PrintLength() {//打印信息的长度
        int hen=0;
        if(number>=0){//未进行改变信息操作时，执行此步打印
        for(int i=0;i<=number;i++){
            hen+=real.get(i).Information.length;
            }
        }
        if(number<0)
            hen+=real.get(0).Information.length;//进行了改变信息操作后执行此步打印
        System.out.println( hen);
    }




}
