package com.better.sparrow.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 9:03 PM 2019/1/13
 * @Modified By :
 */
@Data
public class Item {
    private String partnerName;
    private String subpartnerName;
    private int count;
    private BigDecimal payment;
    private String cityCode;

    public Item(String partnerName,String subpartnerName,int count,BigDecimal payment,String cityCode){
        this.partnerName = partnerName;
        this.subpartnerName = subpartnerName;
        this.count = count;
        this.payment = payment;
        this.cityCode = cityCode;
    }

    public static class partnerNameAndSubpartner {
        private String partnerName;
        private String subpartnerName;
        public partnerNameAndSubpartner(String partnerName, String subpartnerName) {
            this.partnerName = partnerName;
            this.subpartnerName = subpartnerName;
        }

        public String getPartnerName() {
            return partnerName;
        }

        public void setPartnerName(String partnerName) {
            this.partnerName = partnerName;
        }

        public String getSubpartnerName() {
            return subpartnerName;
        }

        public void setSubpartnerName(String subpartnerName) {
            this.subpartnerName = subpartnerName;
        }
        // 注意 重写方法 must implement equals and hash function
    }

    public partnerNameAndSubpartner getPartnerNameAndSubpartner() {
        return new partnerNameAndSubpartner(partnerName, subpartnerName);
    }
}
