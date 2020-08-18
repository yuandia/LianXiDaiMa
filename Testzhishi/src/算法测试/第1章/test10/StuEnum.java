package 算法测试.第1章.test10;

public class StuEnum {
    private void calcByEnum(int iNum,int iOff,float fPercent){
        float fMinDiff=1.0f,fTmp;
        int iRealNum=300;
        for(int i=iNum-iOff+1;i<=iNum+iOff;i++){
            fTmp=Math.abs(Math.round(i*fPercent)/(float)i-fPercent);
            if(fTmp<fMinDiff){
                fMinDiff=fTmp;
                iRealNum=i;
            }
        }
        int iJiuYe=Math.round(iRealNum*fPercent);
        System.out.println("枚举计算出学生总数："+iRealNum);
        System.out.println("已就业学生人数："+iJiuYe);
        System.out.println("条件中的就业率："+fPercent*100+"%");
        System.out.println("实际就业率 "+(iJiuYe/(float)iRealNum)*100+"%");
    }
    public static void main(String args[]){
        StuEnum obj=new StuEnum();
        obj.calcByEnum(300,20,0.8323f);
    }
}
