package demo.util;

import demo.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 抽奖工具类<br/>
 * 整体思想：
 * 奖品集合 + 概率比例集合
 * 将奖品按集合中顺序概率计算成所占比例区间，放入比例集合。并产生一个随机数加入其中，排序。</br>
 * 排序后，随机数落在哪个区间，就表示那个区间的奖品被抽中。</br>
 * 返回的随机数在集合中的索引，该索引就是奖品集合中的索引。</br>
 * 比例区间的计算通过概率相加获得。
 * @author irving
 * @since 2017年7月23日 下午9:48:23
 * @version MARK 0.0.1
 */
public class DrawLotteryUtil {

    public static int drawGift(List<Product> giftList){

        if(null != giftList && giftList.size()>0){
            List<Double> orgProbList = new ArrayList<Double>(giftList.size());
            for(Product gift:giftList){
                //按顺序将概率添加到集合中
                orgProbList.add(gift.getProb());
            }

            return draw(orgProbList);

        }
        return -1;
    }

    public static int draw(List<Double> giftProbList){

        List<Double> sortRateList = new ArrayList<Double>();

        // 计算概率总和
        Double sumRate = 0D;
        for(Double prob : giftProbList){
            sumRate += prob;
        }

        if(sumRate != 0){
            double rate = 0D;   //概率所占比例
            for(Double prob : giftProbList){
                rate += prob;
                // 构建一个比例区段组成的集合(避免概率和不为1)
                sortRateList.add(rate / sumRate);
            }

            // 随机生成一个随机数，并排序
            double random = Math.random();
            sortRateList.add(random);
            Collections.sort(sortRateList);

            // 返回该随机数在比例集合中的索引
            return sortRateList.indexOf(random);
        }


        return -1;
    }

    public static void main(String[] args) {
        Product iphone = new Product();
        iphone.setId(101);
        iphone.setName("苹果手机");
        iphone.setProb(0.0001D);

        Product thanks = new Product();
        thanks.setId(102);
        thanks.setName("再接再厉");
        thanks.setProb(0.7D);

        Product vip = new Product();
        vip.setId(103);
        vip.setName("优酷会员二个月");
        vip.setProb(0.0249D);

        Product aivip = new Product();
        aivip.setId(104);
        aivip.setName("爱奇艺会员一个月");
        aivip.setProb(0.025D);

        Product taovip = new Product();
        taovip.setId(105);
        taovip.setName("淘宝满100减10购物卷");
        taovip.setProb(0.1D);

        Product meituan = new Product();
        meituan.setId(106);
        meituan.setName("美团满100减40美食卷");
        meituan.setProb(0.1D);

        Product huafei = new Product();
        huafei.setId(107);
        huafei.setName("话费购物卡1元劵");
        huafei.setProb(0.1D);

        List<Product> list = new ArrayList<Product>();
        list.add(vip);
        list.add(thanks);
        list.add(iphone);
        list.add(aivip);
        list.add(taovip);
        list.add(meituan);
        list.add(huafei);

        for(int i=0;i<1000;i++){
            int index = drawGift(list);
            System.out.println(list.get(index));
        }
    }

}