package com.pingplusplus;

/**
 * Created by Afon on 2016/12/20.
 */
public class PingppTestData {

    public static String getApiBase() {
        return "https://api.pingxx.com";
    }

    public static String getApiKey() {
        return "sk_test_ibbTe5jLGCi5rzfH4OqPW9KC";
    }

    public static String getAppID() {
        return "app_1Gqj58ynP0mHeX1q";
    }

    public static String getPKCS8PrivateKey() {
        return "-----BEGIN PRIVATE KEY-----\n" +
                "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDHYyS3FwoESp1h\n" +
                "GLYiBhy6k9Ag3lzGCIEvm50IIEkE0Ftc9qq44TWqyl+EHUpTMdcBOcI42JLO5stw\n" +
                "FOfCLa3PQStEJ4llIRFEKlsrHh67pvWd5RNaSBrvGlnFY40S+SZmjk2WF/h9dE9R\n" +
                "ic79t0YI0alD8dIl9Yu3OaEKo7VonBWFwOYMxjPhtORlq+EUF1XJd//yftQrKWTT\n" +
                "d7KaUonWzBCl4VzFop/OyTWYlTuZz3eYJaNpH5VaQ1vDgBAcPIeBvMf7NgBHMKW6\n" +
                "LLmFd2LEYQ/6I7hkGTjysSzWEpO8bPWT6OEsJ2R2kFGOrSkr+G2MDcJ7ykXYAmz5\n" +
                "+A3plS6ZAgMBAAECggEAVrgwR9GlcahiOtDcpn+yDxQq+aC9CQS561LrQZWJLKbS\n" +
                "leRS7IZHKTlLwdJbeUO8F7RfXQoVEBghc2YkRrhHWFUn1ES95VY0hElHzcET7Nn5\n" +
                "CeuQNzwVOtljIg7iVNY4dXJ/HEDguu/Tb8tYU9FajItj60FJ/WiGk/JksJPzWsOC\n" +
                "VPVniy9fTbTLy1e+dCpCI6OXirtm7hvbodRNDjree0wSEzm7vL0wVzEZFo6kX+AB\n" +
                "GUwaoO7pPyH+hgyI5Iuhc65NHsHzTJpf8yNFl9QGhkxvm2Ff2oEtDt1idOTBrHB6\n" +
                "tg+ti9Ctb2+2yzBnk14hsSYJnKitR7wM6ZCFPX4eYQKBgQD+JAREeFkodec/SC+G\n" +
                "X+4Q4Y68uMPkfUPrMKXM4cyY5wgXk64RBvRVxIxX7x6Y3tIKn9v8tWAprbsyVr15\n" +
                "eb4RcAFEVwjuoZixhd9sIPsRhfdNolKn/fSPIsHL4ywcJMSIt7KVKHuQeqBNHy0o\n" +
                "0PxQjNej1ozsmrAWqV55cbKHswKBgQDI2JQRTPIEC/2y6LdmBVhGJW9OKWTYdVNj\n" +
                "q7rX+Yw4uxOtfd5hBqpvgZEklKEk72aazFdEcERlAm9SqoX09qk6zK/wcq4Xn5Q/\n" +
                "qy8ecmjuyf2AK9X+HUdMerMVxhK9RpeevKYP/RO2F/wIN64anlQVYygVkXXgdOvW\n" +
                "hBE4YABKgwKBgDRtmbPGYB5ItHwJmERQZfx1i8zDESaB8RED6DBsJJkmkDTM8ovw\n" +
                "s1c+RPWfDuDalto6QFfR0xTGEmhAHLaCtwNB6AEBM4aHL8jvpTfZVfI3gN0zL3oY\n" +
                "mestcG1vYBouO504yE6dG2Ci6479b4OMGYFEjPfvuwLUpp8GMcc7/WihAoGANCp8\n" +
                "mtm/ammq5VMof2kX+nAyrrx1ovsmQ5cRGpOIZhvBCqjMn6rZjci7aCLqj+tWXRKC\n" +
                "ABagzROK0o/T50JBxjHv6KYArcYW/Up7HI9ezdbM7wNzu2LjZ+veo+MkbuDs9J/P\n" +
                "CgwTmJI2NfQwVl2VPVDZ0nBLi5cSwk7fIiNdL/0CgYEAtECmC1QDs53Di2MIsa/F\n" +
                "e4sWfJGSDqEWqhcA/aPwf1skM6VJJXBBMV1qFtwgO1AlLnu9dQYra6ylsUoubVYI\n" +
                "XM9XK7EMhbqi57+Q75jHFTc0DnzOTyho5Gp4Ddi8dztmZGNWdWTGdeMqh+svqMXk\n" +
                "D6VdJeddyGu/Zlgj7Wk6whU=\n" +
                "-----END PRIVATE KEY-----";
    }

    public static String getChargeWebhooksData() {
        return "{\"id\":\"evt_c4qfbcefvIhsxKuES4CpqdUN\",\"created\":1482204769,\"livemode\":false,\"type\":\"charge.succeeded\",\"data\":{\"object\":{\"amount\":100,\"amount_refunded\":0,\"amount_settle\":100,\"app\":\"app_1Gqj58ynP0mHeX1q\",\"body\":\"Your body\",\"channel\":\"alipay\",\"client_ip\":\"210.28.41.51\",\"created\":1482204769,\"credential\":{},\"currency\":\"cny\",\"description\":\"Description.\",\"extra\":{},\"failure_code\":null,\"failure_msg\":null,\"id\":\"ch_1SiPqPDCuvj5S4OaTSX54KC0\",\"livemode\":false,\"metadata\":{},\"object\":\"charge\",\"order_no\":\"orderno1482210036043\",\"paid\":true,\"refunded\":false,\"refunds\":{\"data\":[],\"has_more\":false,\"object\":\"list\",\"url\":\"/v1/charges/ch_1SiPqPDCuvj5S4OaTSX54KC0/refunds\"},\"subject\":\"Your Subject\",\"time_expire\":1482207768,\"time_paid\":1482204769,\"time_settle\":null,\"transaction_no\":\"2016122028818332\"}},\"object\":\"event\",\"request\":\"iar_cfgO0GxCSs9CH0K4r1t5Whjk\",\"pending_webhooks\":0}";
    }

    public static String getBatchTransferWebhooksData() {
        return "{\"id\":\"evt_cx1zsoQsiPfjagJKt5gydjsx\",\"created\":1475924802,\"livemode\":true,\"type\":\"batch_transfer.succeeded\",\"data\":{\"object\":{\"id\":\"181610081644346142\",\"amount\":2200,\"app\":\"app_1Gqj58ynP0mHeX1q\",\"batch_no\":\"battr1475916275\",\"channel\":\"alipay\",\"created\":1475916274,\"currency\":\"cny\",\"description\":\"Batch transfer description.\",\"extra\":{},\"failure_msg\":null,\"fee\":100,\"livemode\":true,\"metadata\":{},\"object\":\"batch_transfer\",\"recipients\":[{\"account\":\"test@gmail.com\",\"amount\":1100,\"description\":\"批量付款说明。\",\"name\":\"test\",\"status\":\"paid\",\"transfer\":\"tr_uj9GSfTK8G8mLeHu9KafK5WT\"},{\"account\":\"test@gmail.com\",\"amount\":1100,\"description\":\"批量付款说明。\",\"name\":\"test002\",\"status\":\"paid\",\"transfer\":\"tr_PiXiffX4mbevX5HDfT44DmjL\"}],\"status\":\"succeeded\",\"time_succeeded\":null,\"transaction_no\":null,\"type\":\"b2c\"}},\"object\":\"event\",\"request\":\"iar_23eD0xHi58zLfD5HKdnC2nDc\",\"pending_webhooks\":0}";
    }

    public static String getWithdrawalWebhooksData() {
        return "{\"id\":\"evt_gJKt5gzsoQsiPfcx1Pfjajaw\",\"created\":1475924802,\"livemode\":true,\"type\":\"balance.withdrawal.succeeded\",\"data\":{\"object\":{\"id\":\"1701611150302360654\",\"object\":\"withdrawal\",\"app\":\"app_1Gqj58ynP0mHeX1q\",\"amount\":20000,\"asset_transaction\":\"\",\"balance_transaction\":\"\",\"channel\":\"unionpay\",\"created\":1472648887,\"description\":\"test232description\",\"extra\":{\"card_number\":\"6225210207073918\",\"user_name\":\"姓名\",\"open_bank_code\":\"0102\",\"prov\":\"上海\",\"city\":\"上海\"},\"fee\":200,\"livemode\":true,\"metadata\":{},\"order_no\":\"20160829133002\",\"source\":null,\"status\":\"pending\",\"time_canceled\":null,\"time_succeeded\":null,\"user\":\"user_001\",\"user_fee\":50}},\"object\":\"event\",\"request\":\"iar_23eD0xHi58zLfD5HKdnC2nDc\",\"pending_webhooks\":0}";
    }

    public static String getAgreementEventData() {
        return "{\"created\":1526557545,\"livemode\":false,\"type\":\"agreement.succeeded\",\"data\":{\"object\":{\"id\":\"agr_19EEE7QdgGMCoY\",\"object\":\"agreement\",\"livemode\":false,\"app\":\"app_1Gqj58ynP0mHeX1q\",\"created\":1526557489,\"channel\":\"qpay\",\"contract_no\":\"2018051700001\",\"contract_id\":\"1413528914776620328305865065617065\",\"credential\":{},\"status\":\"succeeded\",\"time_succeeded\":1526557545,\"time_canceled\":null,\"failure_code\":null,\"failure_msg\":null,\"extra\":{\"display_account\":\"签约测试\"},\"metadata\":{}}},\"object\":\"event\",\"request\":\"iar_L08SS8iLCubTLi10yDrbP4a5\",\"scope\":\"app_1Gqj58ynP0mHeX1q\",\"acct_id\":\"acct_zjb1KS1i9C0CvzrL\"}";
    }

    public static String getRechargeSucceededEventData() {
        return "{\"id\":\"evt_400180517202605018219403\",\"created\":1526559964,\"livemode\":false,\"type\":\"recharge.succeeded\",\"data\":{\"object\":{\"id\":\"220180517753149716480010\",\"object\":\"recharge\",\"app\":\"app_1Gqj58ynP0mHeX1q\",\"created\":1526559949,\"livemode\":false,\"amount\":90,\"succeeded\":true,\"time_succeeded\":1526559964,\"refunded\":false,\"user\":\"user_test_02\",\"from_user\":\"user_test_02\",\"user_fee\":10,\"charge\":{\"id\":\"ch_0u9erLv9WPeD48WX14i9SebP\",\"object\":\"charge\",\"created\":1526559949,\"livemode\":false,\"paid\":true,\"refunded\":false,\"reversed\":false,\"app\":\"app_1Gqj58ynP0mHeX1q\",\"channel\":\"alipay_wap\",\"order_no\":\"20171526559948047\",\"client_ip\":\"127.0.0.1\",\"amount\":100,\"amount_settle\":100,\"currency\":\"cny\",\"subject\":\"Recharge subject\",\"body\":\"Recharge body\",\"extra\":{\"success_url\":\"http://www.pingxx.com\",\"buyer_account\":\"alipay_account\"},\"time_paid\":1526559964,\"time_expire\":1526646349,\"time_settle\":null,\"transaction_no\":\"2018051714482272\",\"refunds\":{\"object\":\"list\",\"url\":\"/v1/charges/ch_0u9erLv9WPeD48WX14i9SebP/refunds\",\"has_more\":false,\"data\":[]},\"amount_refunded\":0,\"failure_code\":null,\"failure_msg\":null,\"metadata\":{},\"credential\":{},\"description\":\"Recharge description.\"},\"balance_bonus\":null,\"balance_transaction\":\"600180517753305323520001\",\"description\":\"Recharge description.\",\"metadata\":{}}},\"object\":\"event\",\"request\":\"iar_nbrfrD4en14GrbTirLnfHOC8\",\"pending_webhooks\":0}";
    }

    public static String getOrderSucceededEventData() {
        return "{\"id\":\"evt_400180517202836018305903\",\"created\":1526560116,\"livemode\":false,\"type\":\"order.succeeded\",\"data\":{\"object\":{\"id\":\"2001805170000308581\",\"object\":\"order\",\"created\":1526560047,\"livemode\":false,\"paid\":true,\"refunded\":false,\"status\":\"paid\",\"app\":\"app_1Gqj58ynP0mHeX1q\",\"uid\":\"test_user_001\",\"available_balance\":4,\"merchant_order_no\":\"20171526560045673\",\"amount\":100,\"actual_amount\":100,\"amount_refunded\":0,\"amount_paid\":100,\"coupon_amount\":0,\"currency\":\"cny\",\"subject\":\"ORDER_SUBJECT\",\"body\":\"ORDER_BODY\",\"client_ip\":\"192.168.1.125\",\"time_paid\":1526560116,\"time_expire\":1526646447,\"charge\":\"ch_5iTOm1P8inv1L48iL4bTOyLS\",\"coupon\":null,\"description\":null,\"metadata\":{},\"charge_essentials\":{\"channel\":\"alipay_wap\",\"transaction_no\":\"2018051773981055\",\"failure_code\":null,\"failure_msg\":null,\"extra\":{\"success_url\":\"http://www.pingxx.com\",\"buyer_account\":\"alipay_account\"},\"credential\":{}},\"receipt_app\":\"app_1Gqj58ynP0mHeX1q\",\"service_app\":\"app_1Gqj58ynP0mHeX1q\",\"available_methods\":[],\"charges\":{\"object\":\"list\",\"url\":\"/v1/charges\",\"has_more\":false,\"data\":[{\"id\":\"ch_5iTOm1P8inv1L48iL4bTOyLS\",\"object\":\"charge\",\"created\":1526560093,\"livemode\":false,\"paid\":true,\"refunded\":false,\"reversed\":false,\"app\":\"app_1Gqj58ynP0mHeX1q\",\"channel\":\"alipay_wap\",\"order_no\":\"20171526560045673\",\"client_ip\":\"192.168.1.125\",\"amount\":100,\"amount_settle\":0,\"currency\":\"cny\",\"subject\":\"ORDER_SUBJECT\",\"body\":\"ORDER_BODY\",\"extra\":{\"success_url\":\"http://www.pingxx.com\",\"buyer_account\":\"alipay_account\"},\"time_paid\":1526560116,\"time_expire\":1526646447,\"time_settle\":null,\"transaction_no\":\"2018051773981055\",\"refunds\":null,\"amount_refunded\":0,\"failure_code\":null,\"failure_msg\":null,\"metadata\":{},\"credential\":{},\"description\":null}]}}},\"object\":\"event\",\"request\":\"iar_bXrXH0ib9yT4vLuDmLrDmb5K\",\"pending_webhooks\":0}";
    }
}
