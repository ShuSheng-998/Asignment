public class Test {
    public static void main(String[] args){
        char[]A={'李','梓','漩'};
        char[]B={'宋','天','一'};
        char[]C={'李','梓','漩'};
        pink []ins=new pink[3];
        ins[0]=new pink(A);
        ins[1]=new pink(B);
        ins[2]=new pink(C);

        ins[0].GetInformation();
        ins[0].addInformation(C);
        ins[0].GetInformation();
       ins[0].ChangeInformation(B);
       ins[0].GetInformation();
       ins[0].PrintLength();
    }
}
