
/**
 * ShuJuHuanJingCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */

    package org.tempuri;

    /**
     *  ShuJuHuanJingCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ShuJuHuanJingCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ShuJuHuanJingCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ShuJuHuanJingCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getLinJinShengGuoJiaZhanMinuteDataByStationNum method
            * override this method for handling normal response from getLinJinShengGuoJiaZhanMinuteDataByStationNum operation
            */
           public void receiveResultgetLinJinShengGuoJiaZhanMinuteDataByStationNum(
                    org.tempuri.GetLinJinShengGuoJiaZhanMinuteDataByStationNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLinJinShengGuoJiaZhanMinuteDataByStationNum operation
           */
            public void receiveErrorgetLinJinShengGuoJiaZhanMinuteDataByStationNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGuoJiaZhanXunData method
            * override this method for handling normal response from getGuoJiaZhanXunData operation
            */
           public void receiveResultgetGuoJiaZhanXunData(
                    org.tempuri.GetGuoJiaZhanXunDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGuoJiaZhanXunData operation
           */
            public void receiveErrorgetGuoJiaZhanXunData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQuYuZhanDayDataByQuYuZhanNum method
            * override this method for handling normal response from getQuYuZhanDayDataByQuYuZhanNum operation
            */
           public void receiveResultgetQuYuZhanDayDataByQuYuZhanNum(
                    org.tempuri.GetQuYuZhanDayDataByQuYuZhanNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQuYuZhanDayDataByQuYuZhanNum operation
           */
            public void receiveErrorgetQuYuZhanDayDataByQuYuZhanNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGuoJiaZhanMonthData method
            * override this method for handling normal response from getGuoJiaZhanMonthData operation
            */
           public void receiveResultgetGuoJiaZhanMonthData(
                    org.tempuri.GetGuoJiaZhanMonthDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGuoJiaZhanMonthData operation
           */
            public void receiveErrorgetGuoJiaZhanMonthData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getJingZhiWeiXingOtherPicList method
            * override this method for handling normal response from getJingZhiWeiXingOtherPicList operation
            */
           public void receiveResultgetJingZhiWeiXingOtherPicList(
                    org.tempuri.GetJingZhiWeiXingOtherPicListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getJingZhiWeiXingOtherPicList operation
           */
            public void receiveErrorgetJingZhiWeiXingOtherPicList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Soil01_TuRangShuiWen method
            * override this method for handling normal response from getNongQi_Soil01_TuRangShuiWen operation
            */
           public void receiveResultgetNongQi_Soil01_TuRangShuiWen(
                    org.tempuri.GetNongQi_Soil01_TuRangShuiWenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Soil01_TuRangShuiWen operation
           */
            public void receiveErrorgetNongQi_Soil01_TuRangShuiWen(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Disa03_MuCao method
            * override this method for handling normal response from getNongQi_Disa03_MuCao operation
            */
           public void receiveResultgetNongQi_Disa03_MuCao(
                    org.tempuri.GetNongQi_Disa03_MuCaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Disa03_MuCao operation
           */
            public void receiveErrorgetNongQi_Disa03_MuCao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_BaoYu method
            * override this method for handling normal response from getTongJi_BaoYu operation
            */
           public void receiveResultgetTongJi_BaoYu(
                    org.tempuri.GetTongJi_BaoYuResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_BaoYu operation
           */
            public void receiveErrorgetTongJi_BaoYu(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_ChengZhenDuoShiXiaoYuBao method
            * override this method for handling normal response from getYuBao_ChengZhenDuoShiXiaoYuBao operation
            */
           public void receiveResultgetYuBao_ChengZhenDuoShiXiaoYuBao(
                    org.tempuri.GetYuBao_ChengZhenDuoShiXiaoYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_ChengZhenDuoShiXiaoYuBao operation
           */
            public void receiveErrorgetYuBao_ChengZhenDuoShiXiaoYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQuYuZhanListByGuoJiaZhan method
            * override this method for handling normal response from getQuYuZhanListByGuoJiaZhan operation
            */
           public void receiveResultgetQuYuZhanListByGuoJiaZhan(
                    org.tempuri.GetQuYuZhanListByGuoJiaZhanResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQuYuZhanListByGuoJiaZhan operation
           */
            public void receiveErrorgetQuYuZhanListByGuoJiaZhan(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Disa01_GuanCe method
            * override this method for handling normal response from getNongQi_Disa01_GuanCe operation
            */
           public void receiveResultgetNongQi_Disa01_GuanCe(
                    org.tempuri.GetNongQi_Disa01_GuanCeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Disa01_GuanCe operation
           */
            public void receiveErrorgetNongQi_Disa01_GuanCe(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Disa04_JiaChu method
            * override this method for handling normal response from getNongQi_Disa04_JiaChu operation
            */
           public void receiveResultgetNongQi_Disa04_JiaChu(
                    org.tempuri.GetNongQi_Disa04_JiaChuResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Disa04_JiaChu operation
           */
            public void receiveErrorgetNongQi_Disa04_JiaChu(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_GaoWen method
            * override this method for handling normal response from getTongJi_GaoWen operation
            */
           public void receiveResultgetTongJi_GaoWen(
                    org.tempuri.GetTongJi_GaoWenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_GaoWen operation
           */
            public void receiveErrorgetTongJi_GaoWen(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQuYuZhanHourData method
            * override this method for handling normal response from getQuYuZhanHourData operation
            */
           public void receiveResultgetQuYuZhanHourData(
                    org.tempuri.GetQuYuZhanHourDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQuYuZhanHourData operation
           */
            public void receiveErrorgetQuYuZhanHourData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Grass04_FuGaiDu method
            * override this method for handling normal response from getNongQi_Grass04_FuGaiDu operation
            */
           public void receiveResultgetNongQi_Grass04_FuGaiDu(
                    org.tempuri.GetNongQi_Grass04_FuGaiDuResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Grass04_FuGaiDu operation
           */
            public void receiveErrorgetNongQi_Grass04_FuGaiDu(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGeDianHuaData method
            * override this method for handling normal response from getGeDianHuaData operation
            */
           public void receiveResultgetGeDianHuaData(
                    org.tempuri.GetGeDianHuaDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGeDianHuaData operation
           */
            public void receiveErrorgetGeDianHuaData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTuRangShuiFenZhanListByCityName method
            * override this method for handling normal response from getTuRangShuiFenZhanListByCityName operation
            */
           public void receiveResultgetTuRangShuiFenZhanListByCityName(
                    org.tempuri.GetTuRangShuiFenZhanListByCityNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTuRangShuiFenZhanListByCityName operation
           */
            public void receiveErrorgetTuRangShuiFenZhanListByCityName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_ZhongQiYuBao method
            * override this method for handling normal response from getYuBao_ZhongQiYuBao operation
            */
           public void receiveResultgetYuBao_ZhongQiYuBao(
                    org.tempuri.GetYuBao_ZhongQiYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_ZhongQiYuBao operation
           */
            public void receiveErrorgetYuBao_ZhongQiYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLinJinShengGuoJiaZhanHourDataByStationNum method
            * override this method for handling normal response from getLinJinShengGuoJiaZhanHourDataByStationNum operation
            */
           public void receiveResultgetLinJinShengGuoJiaZhanHourDataByStationNum(
                    org.tempuri.GetLinJinShengGuoJiaZhanHourDataByStationNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLinJinShengGuoJiaZhanHourDataByStationNum operation
           */
            public void receiveErrorgetLinJinShengGuoJiaZhanHourDataByStationNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLinJinShengGuoJiaZhanListByProvince method
            * override this method for handling normal response from getLinJinShengGuoJiaZhanListByProvince operation
            */
           public void receiveResultgetLinJinShengGuoJiaZhanListByProvince(
                    org.tempuri.GetLinJinShengGuoJiaZhanListByProvinceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLinJinShengGuoJiaZhanListByProvince operation
           */
            public void receiveErrorgetLinJinShengGuoJiaZhanListByProvince(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_RainMaxInOneHour method
            * override this method for handling normal response from getTongJi_RainMaxInOneHour operation
            */
           public void receiveResultgetTongJi_RainMaxInOneHour(
                    org.tempuri.GetTongJi_RainMaxInOneHourResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_RainMaxInOneHour operation
           */
            public void receiveErrorgetTongJi_RainMaxInOneHour(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQuYuZhanMinuteData method
            * override this method for handling normal response from getQuYuZhanMinuteData operation
            */
           public void receiveResultgetQuYuZhanMinuteData(
                    org.tempuri.GetQuYuZhanMinuteDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQuYuZhanMinuteData operation
           */
            public void receiveErrorgetQuYuZhanMinuteData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGuoJiaZhanListByCityName method
            * override this method for handling normal response from getGuoJiaZhanListByCityName operation
            */
           public void receiveResultgetGuoJiaZhanListByCityName(
                    org.tempuri.GetGuoJiaZhanListByCityNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGuoJiaZhanListByCityName operation
           */
            public void receiveErrorgetGuoJiaZhanListByCityName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Grass03_ChanLiang method
            * override this method for handling normal response from getNongQi_Grass03_ChanLiang operation
            */
           public void receiveResultgetNongQi_Grass03_ChanLiang(
                    org.tempuri.GetNongQi_Grass03_ChanLiangResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Grass03_ChanLiang operation
           */
            public void receiveErrorgetNongQi_Grass03_ChanLiang(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_DaChengShiDuoShiXiaoYuBao method
            * override this method for handling normal response from getYuBao_DaChengShiDuoShiXiaoYuBao operation
            */
           public void receiveResultgetYuBao_DaChengShiDuoShiXiaoYuBao(
                    org.tempuri.GetYuBao_DaChengShiDuoShiXiaoYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_DaChengShiDuoShiXiaoYuBao operation
           */
            public void receiveErrorgetYuBao_DaChengShiDuoShiXiaoYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQuYuZhanListByStationNum method
            * override this method for handling normal response from getQuYuZhanListByStationNum operation
            */
           public void receiveResultgetQuYuZhanListByStationNum(
                    org.tempuri.GetQuYuZhanListByStationNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQuYuZhanListByStationNum operation
           */
            public void receiveErrorgetQuYuZhanListByStationNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTuRangShuiFenZhanListByGuoJiaZhan method
            * override this method for handling normal response from getTuRangShuiFenZhanListByGuoJiaZhan operation
            */
           public void receiveResultgetTuRangShuiFenZhanListByGuoJiaZhan(
                    org.tempuri.GetTuRangShuiFenZhanListByGuoJiaZhanResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTuRangShuiFenZhanListByGuoJiaZhan operation
           */
            public void receiveErrorgetTuRangShuiFenZhanListByGuoJiaZhan(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQuYuZhanListByCityName method
            * override this method for handling normal response from getQuYuZhanListByCityName operation
            */
           public void receiveResultgetQuYuZhanListByCityName(
                    org.tempuri.GetQuYuZhanListByCityNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQuYuZhanListByCityName operation
           */
            public void receiveErrorgetQuYuZhanListByCityName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_WeatherStationCount method
            * override this method for handling normal response from getTongJi_WeatherStationCount operation
            */
           public void receiveResultgetTongJi_WeatherStationCount(
                    org.tempuri.GetTongJi_WeatherStationCountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_WeatherStationCount operation
           */
            public void receiveErrorgetTongJi_WeatherStationCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSelectTopData method
            * override this method for handling normal response from getSelectTopData operation
            */
           public void receiveResultgetSelectTopData(
                    org.tempuri.GetSelectTopDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSelectTopData operation
           */
            public void receiveErrorgetSelectTopData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getJiaoTongZhanListByStationNum method
            * override this method for handling normal response from getJiaoTongZhanListByStationNum operation
            */
           public void receiveResultgetJiaoTongZhanListByStationNum(
                    org.tempuri.GetJiaoTongZhanListByStationNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getJiaoTongZhanListByStationNum operation
           */
            public void receiveErrorgetJiaoTongZhanListByStationNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWsData method
            * override this method for handling normal response from getWsData operation
            */
           public void receiveResultgetWsData(
                    org.tempuri.GetWsDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWsData operation
           */
            public void receiveErrorgetWsData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_MaxChangeTemp method
            * override this method for handling normal response from getTongJi_MaxChangeTemp operation
            */
           public void receiveResultgetTongJi_MaxChangeTemp(
                    org.tempuri.GetTongJi_MaxChangeTempResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_MaxChangeTemp operation
           */
            public void receiveErrorgetTongJi_MaxChangeTemp(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTuRangShuiFenZhanHourDataBySetHour method
            * override this method for handling normal response from getTuRangShuiFenZhanHourDataBySetHour operation
            */
           public void receiveResultgetTuRangShuiFenZhanHourDataBySetHour(
                    org.tempuri.GetTuRangShuiFenZhanHourDataBySetHourResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTuRangShuiFenZhanHourDataBySetHour operation
           */
            public void receiveErrorgetTuRangShuiFenZhanHourDataBySetHour(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Pheno02_ShuiWen method
            * override this method for handling normal response from getNongQi_Pheno02_ShuiWen operation
            */
           public void receiveResultgetNongQi_Pheno02_ShuiWen(
                    org.tempuri.GetNongQi_Pheno02_ShuiWenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Pheno02_ShuiWen operation
           */
            public void receiveErrorgetNongQi_Pheno02_ShuiWen(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getShanDianDingWeiData method
            * override this method for handling normal response from getShanDianDingWeiData operation
            */
           public void receiveResultgetShanDianDingWeiData(
                    org.tempuri.GetShanDianDingWeiDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getShanDianDingWeiData operation
           */
            public void receiveErrorgetShanDianDingWeiData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Crop01_FaYuQi method
            * override this method for handling normal response from getNongQi_Crop01_FaYuQi operation
            */
           public void receiveResultgetNongQi_Crop01_FaYuQi(
                    org.tempuri.GetNongQi_Crop01_FaYuQiResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Crop01_FaYuQi operation
           */
            public void receiveErrorgetNongQi_Crop01_FaYuQi(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_LianYinYu method
            * override this method for handling normal response from getTongJi_LianYinYu operation
            */
           public void receiveResultgetTongJi_LianYinYu(
                    org.tempuri.GetTongJi_LianYinYuResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_LianYinYu operation
           */
            public void receiveErrorgetTongJi_LianYinYu(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_ShuangDong method
            * override this method for handling normal response from getTongJi_ShuangDong operation
            */
           public void receiveResultgetTongJi_ShuangDong(
                    org.tempuri.GetTongJi_ShuangDongResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_ShuangDong operation
           */
            public void receiveErrorgetTongJi_ShuangDong(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTuRangShuiFenZhanListByStationNum method
            * override this method for handling normal response from getTuRangShuiFenZhanListByStationNum operation
            */
           public void receiveResultgetTuRangShuiFenZhanListByStationNum(
                    org.tempuri.GetTuRangShuiFenZhanListByStationNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTuRangShuiFenZhanListByStationNum operation
           */
            public void receiveErrorgetTuRangShuiFenZhanListByStationNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_T639YuBao method
            * override this method for handling normal response from getYuBao_T639YuBao operation
            */
           public void receiveResultgetYuBao_T639YuBao(
                    org.tempuri.GetYuBao_T639YuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_T639YuBao operation
           */
            public void receiveErrorgetYuBao_T639YuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGeDianHuaYuBaoStationValue method
            * override this method for handling normal response from getGeDianHuaYuBaoStationValue operation
            */
           public void receiveResultgetGeDianHuaYuBaoStationValue(
                    org.tempuri.GetGeDianHuaYuBaoStationValueResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGeDianHuaYuBaoStationValue operation
           */
            public void receiveErrorgetGeDianHuaYuBaoStationValue(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLinJinShengQuYuZhanListByProvince method
            * override this method for handling normal response from getLinJinShengQuYuZhanListByProvince operation
            */
           public void receiveResultgetLinJinShengQuYuZhanListByProvince(
                    org.tempuri.GetLinJinShengQuYuZhanListByProvinceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLinJinShengQuYuZhanListByProvince operation
           */
            public void receiveErrorgetLinJinShengQuYuZhanListByProvince(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRMAPS_IN_PicList method
            * override this method for handling normal response from getRMAPS_IN_PicList operation
            */
           public void receiveResultgetRMAPS_IN_PicList(
                    org.tempuri.GetRMAPS_IN_PicListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRMAPS_IN_PicList operation
           */
            public void receiveErrorgetRMAPS_IN_PicList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHuanJingZhanListByStationNum method
            * override this method for handling normal response from getHuanJingZhanListByStationNum operation
            */
           public void receiveResultgetHuanJingZhanListByStationNum(
                    org.tempuri.GetHuanJingZhanListByStationNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHuanJingZhanListByStationNum operation
           */
            public void receiveErrorgetHuanJingZhanListByStationNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getShuiWenZhanListByCityName method
            * override this method for handling normal response from getShuiWenZhanListByCityName operation
            */
           public void receiveResultgetShuiWenZhanListByCityName(
                    org.tempuri.GetShuiWenZhanListByCityNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getShuiWenZhanListByCityName operation
           */
            public void receiveErrorgetShuiWenZhanListByCityName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGuoJiaZhanDayData method
            * override this method for handling normal response from getGuoJiaZhanDayData operation
            */
           public void receiveResultgetGuoJiaZhanDayData(
                    org.tempuri.GetGuoJiaZhanDayDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGuoJiaZhanDayData operation
           */
            public void receiveErrorgetGuoJiaZhanDayData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHuanJingZhanDayData method
            * override this method for handling normal response from getHuanJingZhanDayData operation
            */
           public void receiveResultgetHuanJingZhanDayData(
                    org.tempuri.GetHuanJingZhanDayDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHuanJingZhanDayData operation
           */
            public void receiveErrorgetHuanJingZhanDayData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Grass02_GaoDu method
            * override this method for handling normal response from getNongQi_Grass02_GaoDu operation
            */
           public void receiveResultgetNongQi_Grass02_GaoDu(
                    org.tempuri.GetNongQi_Grass02_GaoDuResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Grass02_GaoDu operation
           */
            public void receiveErrorgetNongQi_Grass02_GaoDu(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHuanJingZhanListByCityName method
            * override this method for handling normal response from getHuanJingZhanListByCityName operation
            */
           public void receiveResultgetHuanJingZhanListByCityName(
                    org.tempuri.GetHuanJingZhanListByCityNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHuanJingZhanListByCityName operation
           */
            public void receiveErrorgetHuanJingZhanListByCityName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_QiangDuiLiu method
            * override this method for handling normal response from getTongJi_QiangDuiLiu operation
            */
           public void receiveResultgetTongJi_QiangDuiLiu(
                    org.tempuri.GetTongJi_QiangDuiLiuResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_QiangDuiLiu operation
           */
            public void receiveErrorgetTongJi_QiangDuiLiu(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGuoJiaZhanHourData method
            * override this method for handling normal response from getGuoJiaZhanHourData operation
            */
           public void receiveResultgetGuoJiaZhanHourData(
                    org.tempuri.GetGuoJiaZhanHourDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGuoJiaZhanHourData operation
           */
            public void receiveErrorgetGuoJiaZhanHourData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getChinaGuoJiaZhanListByProvince method
            * override this method for handling normal response from getChinaGuoJiaZhanListByProvince operation
            */
           public void receiveResultgetChinaGuoJiaZhanListByProvince(
                    org.tempuri.GetChinaGuoJiaZhanListByProvinceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getChinaGuoJiaZhanListByProvince operation
           */
            public void receiveErrorgetChinaGuoJiaZhanListByProvince(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getXiaoQiHouStationList method
            * override this method for handling normal response from getXiaoQiHouStationList operation
            */
           public void receiveResultgetXiaoQiHouStationList(
                    org.tempuri.GetXiaoQiHouStationListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getXiaoQiHouStationList operation
           */
            public void receiveErrorgetXiaoQiHouStationList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_GanHan method
            * override this method for handling normal response from getTongJi_GanHan operation
            */
           public void receiveResultgetTongJi_GanHan(
                    org.tempuri.GetTongJi_GanHanResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_GanHan operation
           */
            public void receiveErrorgetTongJi_GanHan(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_DaChengShiYuBao method
            * override this method for handling normal response from getYuBao_DaChengShiYuBao operation
            */
           public void receiveResultgetYuBao_DaChengShiYuBao(
                    org.tempuri.GetYuBao_DaChengShiYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_DaChengShiYuBao operation
           */
            public void receiveErrorgetYuBao_DaChengShiYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Grass06_BiaoQing method
            * override this method for handling normal response from getNongQi_Grass06_BiaoQing operation
            */
           public void receiveResultgetNongQi_Grass06_BiaoQing(
                    org.tempuri.GetNongQi_Grass06_BiaoQingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Grass06_BiaoQing operation
           */
            public void receiveErrorgetNongQi_Grass06_BiaoQing(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get1981_2010HistroyMonthData method
            * override this method for handling normal response from get1981_2010HistroyMonthData operation
            */
           public void receiveResultget1981_2010HistroyMonthData(
                    org.tempuri.Get1981_2010HistroyMonthDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get1981_2010HistroyMonthData operation
           */
            public void receiveErrorget1981_2010HistroyMonthData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_QuYuZhanLimitValueStationCount method
            * override this method for handling normal response from getTongJi_QuYuZhanLimitValueStationCount operation
            */
           public void receiveResultgetTongJi_QuYuZhanLimitValueStationCount(
                    org.tempuri.GetTongJi_QuYuZhanLimitValueStationCountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_QuYuZhanLimitValueStationCount operation
           */
            public void receiveErrorgetTongJi_QuYuZhanLimitValueStationCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_GanReFeng method
            * override this method for handling normal response from getTongJi_GanReFeng operation
            */
           public void receiveResultgetTongJi_GanReFeng(
                    org.tempuri.GetTongJi_GanReFengResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_GanReFeng operation
           */
            public void receiveErrorgetTongJi_GanReFeng(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_ChengZhenYuBao method
            * override this method for handling normal response from getYuBao_ChengZhenYuBao operation
            */
           public void receiveResultgetYuBao_ChengZhenYuBao(
                    org.tempuri.GetYuBao_ChengZhenYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_ChengZhenYuBao operation
           */
            public void receiveErrorgetYuBao_ChengZhenYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGPSData method
            * override this method for handling normal response from getGPSData operation
            */
           public void receiveResultgetGPSData(
                    org.tempuri.GetGPSDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGPSData operation
           */
            public void receiveErrorgetGPSData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getJiaoTongQiXiangData method
            * override this method for handling normal response from getJiaoTongQiXiangData operation
            */
           public void receiveResultgetJiaoTongQiXiangData(
                    org.tempuri.GetJiaoTongQiXiangDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getJiaoTongQiXiangData operation
           */
            public void receiveErrorgetJiaoTongQiXiangData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_JiData method
            * override this method for handling normal response from getTongJi_JiData operation
            */
           public void receiveResultgetTongJi_JiData(
                    org.tempuri.GetTongJi_JiDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_JiData operation
           */
            public void receiveErrorgetTongJi_JiData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_Data method
            * override this method for handling normal response from getTongJi_Data operation
            */
           public void receiveResultgetTongJi_Data(
                    org.tempuri.GetTongJi_DataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_Data operation
           */
            public void receiveErrorgetTongJi_Data(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJiData_ZhuanTi_Rain method
            * override this method for handling normal response from getTongJiData_ZhuanTi_Rain operation
            */
           public void receiveResultgetTongJiData_ZhuanTi_Rain(
                    org.tempuri.GetTongJiData_ZhuanTi_RainResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJiData_ZhuanTi_Rain operation
           */
            public void receiveErrorgetTongJiData_ZhuanTi_Rain(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQuYuZhanHourDataByQuYuZhanNum method
            * override this method for handling normal response from getQuYuZhanHourDataByQuYuZhanNum operation
            */
           public void receiveResultgetQuYuZhanHourDataByQuYuZhanNum(
                    org.tempuri.GetQuYuZhanHourDataByQuYuZhanNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQuYuZhanHourDataByQuYuZhanNum operation
           */
            public void receiveErrorgetQuYuZhanHourDataByQuYuZhanNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_ChengZhenYuBaoDate method
            * override this method for handling normal response from getYuBao_ChengZhenYuBaoDate operation
            */
           public void receiveResultgetYuBao_ChengZhenYuBaoDate(
                    org.tempuri.GetYuBao_ChengZhenYuBaoDateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_ChengZhenYuBaoDate operation
           */
            public void receiveErrorgetYuBao_ChengZhenYuBaoDate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDataModify method
            * override this method for handling normal response from getDataModify operation
            */
           public void receiveResultgetDataModify(
                    org.tempuri.GetDataModifyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDataModify operation
           */
            public void receiveErrorgetDataModify(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_LinJinYuBao method
            * override this method for handling normal response from getYuBao_LinJinYuBao operation
            */
           public void receiveResultgetYuBao_LinJinYuBao(
                    org.tempuri.GetYuBao_LinJinYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_LinJinYuBao operation
           */
            public void receiveErrorgetYuBao_LinJinYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getChinaGuoJiaZhanMinuteData method
            * override this method for handling normal response from getChinaGuoJiaZhanMinuteData operation
            */
           public void receiveResultgetChinaGuoJiaZhanMinuteData(
                    org.tempuri.GetChinaGuoJiaZhanMinuteDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getChinaGuoJiaZhanMinuteData operation
           */
            public void receiveErrorgetChinaGuoJiaZhanMinuteData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_LimitValueStationCount method
            * override this method for handling normal response from getTongJi_LimitValueStationCount operation
            */
           public void receiveResultgetTongJi_LimitValueStationCount(
                    org.tempuri.GetTongJi_LimitValueStationCountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_LimitValueStationCount operation
           */
            public void receiveErrorgetTongJi_LimitValueStationCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_DuanQiYuBao method
            * override this method for handling normal response from getYuBao_DuanQiYuBao operation
            */
           public void receiveResultgetYuBao_DuanQiYuBao(
                    org.tempuri.GetYuBao_DuanQiYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_DuanQiYuBao operation
           */
            public void receiveErrorgetYuBao_DuanQiYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLeiDaRainPicList method
            * override this method for handling normal response from getLeiDaRainPicList operation
            */
           public void receiveResultgetLeiDaRainPicList(
                    org.tempuri.GetLeiDaRainPicListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLeiDaRainPicList operation
           */
            public void receiveErrorgetLeiDaRainPicList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getShuiWenZhanListByGuoJiaZhan method
            * override this method for handling normal response from getShuiWenZhanListByGuoJiaZhan operation
            */
           public void receiveResultgetShuiWenZhanListByGuoJiaZhan(
                    org.tempuri.GetShuiWenZhanListByGuoJiaZhanResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getShuiWenZhanListByGuoJiaZhan operation
           */
            public void receiveErrorgetShuiWenZhanListByGuoJiaZhan(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Mete02_Month method
            * override this method for handling normal response from getNongQi_Mete02_Month operation
            */
           public void receiveResultgetNongQi_Mete02_Month(
                    org.tempuri.GetNongQi_Mete02_MonthResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Mete02_Month operation
           */
            public void receiveErrorgetNongQi_Mete02_Month(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_LimitValueDayCount method
            * override this method for handling normal response from getTongJi_LimitValueDayCount operation
            */
           public void receiveResultgetTongJi_LimitValueDayCount(
                    org.tempuri.GetTongJi_LimitValueDayCountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_LimitValueDayCount operation
           */
            public void receiveErrorgetTongJi_LimitValueDayCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_EffectiveAccumulatedTemperature method
            * override this method for handling normal response from getTongJi_EffectiveAccumulatedTemperature operation
            */
           public void receiveResultgetTongJi_EffectiveAccumulatedTemperature(
                    org.tempuri.GetTongJi_EffectiveAccumulatedTemperatureResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_EffectiveAccumulatedTemperature operation
           */
            public void receiveErrorgetTongJi_EffectiveAccumulatedTemperature(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_WrfYuBao method
            * override this method for handling normal response from getYuBao_WrfYuBao operation
            */
           public void receiveResultgetYuBao_WrfYuBao(
                    org.tempuri.GetYuBao_WrfYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_WrfYuBao operation
           */
            public void receiveErrorgetYuBao_WrfYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getChinaGuoJiaZhanHourData method
            * override this method for handling normal response from getChinaGuoJiaZhanHourData operation
            */
           public void receiveResultgetChinaGuoJiaZhanHourData(
                    org.tempuri.GetChinaGuoJiaZhanHourDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getChinaGuoJiaZhanHourData operation
           */
            public void receiveErrorgetChinaGuoJiaZhanHourData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGuoJiaZhanYearData method
            * override this method for handling normal response from getGuoJiaZhanYearData operation
            */
           public void receiveResultgetGuoJiaZhanYearData(
                    org.tempuri.GetGuoJiaZhanYearDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGuoJiaZhanYearData operation
           */
            public void receiveErrorgetGuoJiaZhanYearData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_IncaYuBao method
            * override this method for handling normal response from getYuBao_IncaYuBao operation
            */
           public void receiveResultgetYuBao_IncaYuBao(
                    org.tempuri.GetYuBao_IncaYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_IncaYuBao operation
           */
            public void receiveErrorgetYuBao_IncaYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGuoJiaZhanListByStationNum method
            * override this method for handling normal response from getGuoJiaZhanListByStationNum operation
            */
           public void receiveResultgetGuoJiaZhanListByStationNum(
                    org.tempuri.GetGuoJiaZhanListByStationNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGuoJiaZhanListByStationNum operation
           */
            public void receiveErrorgetGuoJiaZhanListByStationNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_WeatherDayCount method
            * override this method for handling normal response from getTongJi_WeatherDayCount operation
            */
           public void receiveResultgetTongJi_WeatherDayCount(
                    org.tempuri.GetTongJi_WeatherDayCountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_WeatherDayCount operation
           */
            public void receiveErrorgetTongJi_WeatherDayCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Disa02_DiaoCha method
            * override this method for handling normal response from getNongQi_Disa02_DiaoCha operation
            */
           public void receiveResultgetNongQi_Disa02_DiaoCha(
                    org.tempuri.GetNongQi_Disa02_DiaoChaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Disa02_DiaoCha operation
           */
            public void receiveErrorgetNongQi_Disa02_DiaoCha(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQuYuZhanDayDataByGuoJiaZhanNum method
            * override this method for handling normal response from getQuYuZhanDayDataByGuoJiaZhanNum operation
            */
           public void receiveResultgetQuYuZhanDayDataByGuoJiaZhanNum(
                    org.tempuri.GetQuYuZhanDayDataByGuoJiaZhanNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQuYuZhanDayDataByGuoJiaZhanNum operation
           */
            public void receiveErrorgetQuYuZhanDayDataByGuoJiaZhanNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTuRangShuiFenZhanHourData method
            * override this method for handling normal response from getTuRangShuiFenZhanHourData operation
            */
           public void receiveResultgetTuRangShuiFenZhanHourData(
                    org.tempuri.GetTuRangShuiFenZhanHourDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTuRangShuiFenZhanHourData operation
           */
            public void receiveErrorgetTuRangShuiFenZhanHourData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGPSDataById method
            * override this method for handling normal response from getGPSDataById operation
            */
           public void receiveResultgetGPSDataById(
                    org.tempuri.GetGPSDataByIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGPSDataById operation
           */
            public void receiveErrorgetGPSDataById(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Soil03_ShuiFenZongLiang method
            * override this method for handling normal response from getNongQi_Soil03_ShuiFenZongLiang operation
            */
           public void receiveResultgetNongQi_Soil03_ShuiFenZongLiang(
                    org.tempuri.GetNongQi_Soil03_ShuiFenZongLiangResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Soil03_ShuiFenZongLiang operation
           */
            public void receiveErrorgetNongQi_Soil03_ShuiFenZongLiang(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getXiaoQiHou method
            * override this method for handling normal response from getXiaoQiHou operation
            */
           public void receiveResultgetXiaoQiHou(
                    org.tempuri.GetXiaoQiHouResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getXiaoQiHou operation
           */
            public void receiveErrorgetXiaoQiHou(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getJiaoTongLuMian1Data method
            * override this method for handling normal response from getJiaoTongLuMian1Data operation
            */
           public void receiveResultgetJiaoTongLuMian1Data(
                    org.tempuri.GetJiaoTongLuMian1DataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getJiaoTongLuMian1Data operation
           */
            public void receiveErrorgetJiaoTongLuMian1Data(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_EcmwfPicture method
            * override this method for handling normal response from getYuBao_EcmwfPicture operation
            */
           public void receiveResultgetYuBao_EcmwfPicture(
                    org.tempuri.GetYuBao_EcmwfPictureResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_EcmwfPicture operation
           */
            public void receiveErrorgetYuBao_EcmwfPicture(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_AccumulatedTemperature method
            * override this method for handling normal response from getTongJi_AccumulatedTemperature operation
            */
           public void receiveResultgetTongJi_AccumulatedTemperature(
                    org.tempuri.GetTongJi_AccumulatedTemperatureResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_AccumulatedTemperature operation
           */
            public void receiveErrorgetTongJi_AccumulatedTemperature(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Crop03_GuanJiang method
            * override this method for handling normal response from getNongQi_Crop03_GuanJiang operation
            */
           public void receiveResultgetNongQi_Crop03_GuanJiang(
                    org.tempuri.GetNongQi_Crop03_GuanJiangResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Crop03_GuanJiang operation
           */
            public void receiveErrorgetNongQi_Crop03_GuanJiang(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getShuiWenRainHourDataByGuoJiaZhan method
            * override this method for handling normal response from getShuiWenRainHourDataByGuoJiaZhan operation
            */
           public void receiveResultgetShuiWenRainHourDataByGuoJiaZhan(
                    org.tempuri.GetShuiWenRainHourDataByGuoJiaZhanResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getShuiWenRainHourDataByGuoJiaZhan operation
           */
            public void receiveErrorgetShuiWenRainHourDataByGuoJiaZhan(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getShuiWenRainHourData method
            * override this method for handling normal response from getShuiWenRainHourData operation
            */
           public void receiveResultgetShuiWenRainHourData(
                    org.tempuri.GetShuiWenRainHourDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getShuiWenRainHourData operation
           */
            public void receiveErrorgetShuiWenRainHourData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Grass05_MiDu method
            * override this method for handling normal response from getNongQi_Grass05_MiDu operation
            */
           public void receiveResultgetNongQi_Grass05_MiDu(
                    org.tempuri.GetNongQi_Grass05_MiDuResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Grass05_MiDu operation
           */
            public void receiveErrorgetNongQi_Grass05_MiDu(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getJingZhiWeiXingPicList method
            * override this method for handling normal response from getJingZhiWeiXingPicList operation
            */
           public void receiveResultgetJingZhiWeiXingPicList(
                    org.tempuri.GetJingZhiWeiXingPicListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getJingZhiWeiXingPicList operation
           */
            public void receiveErrorgetJingZhiWeiXingPicList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getShuiWenZhanList method
            * override this method for handling normal response from getShuiWenZhanList operation
            */
           public void receiveResultgetShuiWenZhanList(
                    org.tempuri.GetShuiWenZhanListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getShuiWenZhanList operation
           */
            public void receiveErrorgetShuiWenZhanList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuJingXinHaoDataByState method
            * override this method for handling normal response from getYuJingXinHaoDataByState operation
            */
           public void receiveResultgetYuJingXinHaoDataByState(
                    org.tempuri.GetYuJingXinHaoDataByStateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuJingXinHaoDataByState operation
           */
            public void receiveErrorgetYuJingXinHaoDataByState(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLeiDaPinTuPicList method
            * override this method for handling normal response from getLeiDaPinTuPicList operation
            */
           public void receiveResultgetLeiDaPinTuPicList(
                    org.tempuri.GetLeiDaPinTuPicListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLeiDaPinTuPicList operation
           */
            public void receiveErrorgetLeiDaPinTuPicList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_EcmwfStationPicture method
            * override this method for handling normal response from getYuBao_EcmwfStationPicture operation
            */
           public void receiveResultgetYuBao_EcmwfStationPicture(
                    org.tempuri.GetYuBao_EcmwfStationPictureResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_EcmwfStationPicture operation
           */
            public void receiveErrorgetYuBao_EcmwfStationPicture(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_BaoXue method
            * override this method for handling normal response from getTongJi_BaoXue operation
            */
           public void receiveResultgetTongJi_BaoXue(
                    org.tempuri.GetTongJi_BaoXueResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_BaoXue operation
           */
            public void receiveErrorgetTongJi_BaoXue(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getChinaAllGuoJiaZhan method
            * override this method for handling normal response from getChinaAllGuoJiaZhan operation
            */
           public void receiveResultgetChinaAllGuoJiaZhan(
                    org.tempuri.GetChinaAllGuoJiaZhanResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getChinaAllGuoJiaZhan operation
           */
            public void receiveErrorgetChinaAllGuoJiaZhan(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_GeDianHuaData method
            * override this method for handling normal response from getYuBao_GeDianHuaData operation
            */
           public void receiveResultgetYuBao_GeDianHuaData(
                    org.tempuri.GetYuBao_GeDianHuaDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_GeDianHuaData operation
           */
            public void receiveErrorgetYuBao_GeDianHuaData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuJingXinHaoDataById method
            * override this method for handling normal response from getYuJingXinHaoDataById operation
            */
           public void receiveResultgetYuJingXinHaoDataById(
                    org.tempuri.GetYuJingXinHaoDataByIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuJingXinHaoDataById operation
           */
            public void receiveErrorgetYuJingXinHaoDataById(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_ChengZhenDuoShiXiaoYuBaoByTime method
            * override this method for handling normal response from getYuBao_ChengZhenDuoShiXiaoYuBaoByTime operation
            */
           public void receiveResultgetYuBao_ChengZhenDuoShiXiaoYuBaoByTime(
                    org.tempuri.GetYuBao_ChengZhenDuoShiXiaoYuBaoByTimeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_ChengZhenDuoShiXiaoYuBaoByTime operation
           */
            public void receiveErrorgetYuBao_ChengZhenDuoShiXiaoYuBaoByTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Soil04_YouXiaoShuiFen method
            * override this method for handling normal response from getNongQi_Soil04_YouXiaoShuiFen operation
            */
           public void receiveResultgetNongQi_Soil04_YouXiaoShuiFen(
                    org.tempuri.GetNongQi_Soil04_YouXiaoShuiFenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Soil04_YouXiaoShuiFen operation
           */
            public void receiveErrorgetNongQi_Soil04_YouXiaoShuiFen(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_HanChao method
            * override this method for handling normal response from getTongJi_HanChao operation
            */
           public void receiveResultgetTongJi_HanChao(
                    org.tempuri.GetTongJi_HanChaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_HanChao operation
           */
            public void receiveErrorgetTongJi_HanChao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Soil02_XiangDuiShiDu method
            * override this method for handling normal response from getNongQi_Soil02_XiangDuiShiDu operation
            */
           public void receiveResultgetNongQi_Soil02_XiangDuiShiDu(
                    org.tempuri.GetNongQi_Soil02_XiangDuiShiDuResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Soil02_XiangDuiShiDu operation
           */
            public void receiveErrorgetNongQi_Soil02_XiangDuiShiDu(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHistoryToday method
            * override this method for handling normal response from getHistoryToday operation
            */
           public void receiveResultgetHistoryToday(
                    org.tempuri.GetHistoryTodayResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHistoryToday operation
           */
            public void receiveErrorgetHistoryToday(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHebQuYuZhanHourDataFromFile method
            * override this method for handling normal response from getHebQuYuZhanHourDataFromFile operation
            */
           public void receiveResultgetHebQuYuZhanHourDataFromFile(
                    org.tempuri.GetHebQuYuZhanHourDataFromFileResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHebQuYuZhanHourDataFromFile operation
           */
            public void receiveErrorgetHebQuYuZhanHourDataFromFile(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Pheno01_WuHou method
            * override this method for handling normal response from getNongQi_Pheno01_WuHou operation
            */
           public void receiveResultgetNongQi_Pheno01_WuHou(
                    org.tempuri.GetNongQi_Pheno01_WuHouResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Pheno01_WuHou operation
           */
            public void receiveErrorgetNongQi_Pheno01_WuHou(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGuoJiaZhanHourByHourData method
            * override this method for handling normal response from getGuoJiaZhanHourByHourData operation
            */
           public void receiveResultgetGuoJiaZhanHourByHourData(
                    org.tempuri.GetGuoJiaZhanHourByHourDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGuoJiaZhanHourByHourData operation
           */
            public void receiveErrorgetGuoJiaZhanHourByHourData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWeatherHourData method
            * override this method for handling normal response from getWeatherHourData operation
            */
           public void receiveResultgetWeatherHourData(
                    org.tempuri.GetWeatherHourDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWeatherHourData operation
           */
            public void receiveErrorgetWeatherHourData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_DaFeng method
            * override this method for handling normal response from getTongJi_DaFeng operation
            */
           public void receiveResultgetTongJi_DaFeng(
                    org.tempuri.GetTongJi_DaFengResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_DaFeng operation
           */
            public void receiveErrorgetTongJi_DaFeng(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLinJinShengQuYuZhanHourDataByQuYuZhanNum method
            * override this method for handling normal response from getLinJinShengQuYuZhanHourDataByQuYuZhanNum operation
            */
           public void receiveResultgetLinJinShengQuYuZhanHourDataByQuYuZhanNum(
                    org.tempuri.GetLinJinShengQuYuZhanHourDataByQuYuZhanNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLinJinShengQuYuZhanHourDataByQuYuZhanNum operation
           */
            public void receiveErrorgetLinJinShengQuYuZhanHourDataByQuYuZhanNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_11CityDaChengShiYuBao method
            * override this method for handling normal response from getYuBao_11CityDaChengShiYuBao operation
            */
           public void receiveResultgetYuBao_11CityDaChengShiYuBao(
                    org.tempuri.GetYuBao_11CityDaChengShiYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_11CityDaChengShiYuBao operation
           */
            public void receiveErrorgetYuBao_11CityDaChengShiYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Crop05_ChangLiangJieGou method
            * override this method for handling normal response from getNongQi_Crop05_ChangLiangJieGou operation
            */
           public void receiveResultgetNongQi_Crop05_ChangLiangJieGou(
                    org.tempuri.GetNongQi_Crop05_ChangLiangJieGouResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Crop05_ChangLiangJieGou operation
           */
            public void receiveErrorgetNongQi_Crop05_ChangLiangJieGou(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLeiDaPinTuPicList_NoMap method
            * override this method for handling normal response from getLeiDaPinTuPicList_NoMap operation
            */
           public void receiveResultgetLeiDaPinTuPicList_NoMap(
                    org.tempuri.GetLeiDaPinTuPicList_NoMapResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLeiDaPinTuPicList_NoMap operation
           */
            public void receiveErrorgetLeiDaPinTuPicList_NoMap(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGaoKongSecondDataFile method
            * override this method for handling normal response from getGaoKongSecondDataFile operation
            */
           public void receiveResultgetGaoKongSecondDataFile(
                    org.tempuri.GetGaoKongSecondDataFileResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGaoKongSecondDataFile operation
           */
            public void receiveErrorgetGaoKongSecondDataFile(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTuRangShuiFenZhanHourDataByGuoJiaZhan method
            * override this method for handling normal response from getTuRangShuiFenZhanHourDataByGuoJiaZhan operation
            */
           public void receiveResultgetTuRangShuiFenZhanHourDataByGuoJiaZhan(
                    org.tempuri.GetTuRangShuiFenZhanHourDataByGuoJiaZhanResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTuRangShuiFenZhanHourDataByGuoJiaZhan operation
           */
            public void receiveErrorgetTuRangShuiFenZhanHourDataByGuoJiaZhan(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_YanHaiYuBao method
            * override this method for handling normal response from getYuBao_YanHaiYuBao operation
            */
           public void receiveResultgetYuBao_YanHaiYuBao(
                    org.tempuri.GetYuBao_YanHaiYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_YanHaiYuBao operation
           */
            public void receiveErrorgetYuBao_YanHaiYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getJiaoTongLuMian2Data method
            * override this method for handling normal response from getJiaoTongLuMian2Data operation
            */
           public void receiveResultgetJiaoTongLuMian2Data(
                    org.tempuri.GetJiaoTongLuMian2DataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getJiaoTongLuMian2Data operation
           */
            public void receiveErrorgetJiaoTongLuMian2Data(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get1981_2010HistroyDayData method
            * override this method for handling normal response from get1981_2010HistroyDayData operation
            */
           public void receiveResultget1981_2010HistroyDayData(
                    org.tempuri.Get1981_2010HistroyDayDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get1981_2010HistroyDayData operation
           */
            public void receiveErrorget1981_2010HistroyDayData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Soil05_HuaDong method
            * override this method for handling normal response from getNongQi_Soil05_HuaDong operation
            */
           public void receiveResultgetNongQi_Soil05_HuaDong(
                    org.tempuri.GetNongQi_Soil05_HuaDongResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Soil05_HuaDong operation
           */
            public void receiveErrorgetNongQi_Soil05_HuaDong(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLinJinShengQuYuZhanMinuteDataByQuYuZhanNum method
            * override this method for handling normal response from getLinJinShengQuYuZhanMinuteDataByQuYuZhanNum operation
            */
           public void receiveResultgetLinJinShengQuYuZhanMinuteDataByQuYuZhanNum(
                    org.tempuri.GetLinJinShengQuYuZhanMinuteDataByQuYuZhanNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLinJinShengQuYuZhanMinuteDataByQuYuZhanNum operation
           */
            public void receiveErrorgetLinJinShengQuYuZhanMinuteDataByQuYuZhanNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_RainFallPic method
            * override this method for handling normal response from getYuBao_RainFallPic operation
            */
           public void receiveResultgetYuBao_RainFallPic(
                    org.tempuri.GetYuBao_RainFallPicResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_RainFallPic operation
           */
            public void receiveErrorgetYuBao_RainFallPic(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHuanJingZhanHourData method
            * override this method for handling normal response from getHuanJingZhanHourData operation
            */
           public void receiveResultgetHuanJingZhanHourData(
                    org.tempuri.GetHuanJingZhanHourDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHuanJingZhanHourData operation
           */
            public void receiveErrorgetHuanJingZhanHourData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getShanDianDingWeiDataChina method
            * override this method for handling normal response from getShanDianDingWeiDataChina operation
            */
           public void receiveResultgetShanDianDingWeiDataChina(
                    org.tempuri.GetShanDianDingWeiDataChinaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getShanDianDingWeiDataChina operation
           */
            public void receiveErrorgetShanDianDingWeiDataChina(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJiTuRangShuiFen method
            * override this method for handling normal response from getTongJiTuRangShuiFen operation
            */
           public void receiveResultgetTongJiTuRangShuiFen(
                    org.tempuri.GetTongJiTuRangShuiFenResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJiTuRangShuiFen operation
           */
            public void receiveErrorgetTongJiTuRangShuiFen(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_XiangZhenYuBao method
            * override this method for handling normal response from getYuBao_XiangZhenYuBao operation
            */
           public void receiveResultgetYuBao_XiangZhenYuBao(
                    org.tempuri.GetYuBao_XiangZhenYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_XiangZhenYuBao operation
           */
            public void receiveErrorgetYuBao_XiangZhenYuBao(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getChinaGuoJiaZhanListByStationNum method
            * override this method for handling normal response from getChinaGuoJiaZhanListByStationNum operation
            */
           public void receiveResultgetChinaGuoJiaZhanListByStationNum(
                    org.tempuri.GetChinaGuoJiaZhanListByStationNumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getChinaGuoJiaZhanListByStationNum operation
           */
            public void receiveErrorgetChinaGuoJiaZhanListByStationNum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGuoJiaZhanMinuteData method
            * override this method for handling normal response from getGuoJiaZhanMinuteData operation
            */
           public void receiveResultgetGuoJiaZhanMinuteData(
                    org.tempuri.GetGuoJiaZhanMinuteDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGuoJiaZhanMinuteData operation
           */
            public void receiveErrorgetGuoJiaZhanMinuteData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFuWuProduct method
            * override this method for handling normal response from getFuWuProduct operation
            */
           public void receiveResultgetFuWuProduct(
                    org.tempuri.GetFuWuProductResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFuWuProduct operation
           */
            public void receiveErrorgetFuWuProduct(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Crop06_NongShiHuoDong method
            * override this method for handling normal response from getNongQi_Crop06_NongShiHuoDong operation
            */
           public void receiveResultgetNongQi_Crop06_NongShiHuoDong(
                    org.tempuri.GetNongQi_Crop06_NongShiHuoDongResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Crop06_NongShiHuoDong operation
           */
            public void receiveErrorgetNongQi_Crop06_NongShiHuoDong(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Crop02_GanWuZhi method
            * override this method for handling normal response from getNongQi_Crop02_GanWuZhi operation
            */
           public void receiveResultgetNongQi_Crop02_GanWuZhi(
                    org.tempuri.GetNongQi_Crop02_GanWuZhiResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Crop02_GanWuZhi operation
           */
            public void receiveErrorgetNongQi_Crop02_GanWuZhi(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Crop07_ChangLiangShuiPing method
            * override this method for handling normal response from getNongQi_Crop07_ChangLiangShuiPing operation
            */
           public void receiveResultgetNongQi_Crop07_ChangLiangShuiPing(
                    org.tempuri.GetNongQi_Crop07_ChangLiangShuiPingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Crop07_ChangLiangShuiPing operation
           */
            public void receiveErrorgetNongQi_Crop07_ChangLiangShuiPing(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStationInfo method
            * override this method for handling normal response from getStationInfo operation
            */
           public void receiveResultgetStationInfo(
                    org.tempuri.GetStationInfoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStationInfo operation
           */
            public void receiveErrorgetStationInfo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Crop04_ChanLiang method
            * override this method for handling normal response from getNongQi_Crop04_ChanLiang operation
            */
           public void receiveResultgetNongQi_Crop04_ChanLiang(
                    org.tempuri.GetNongQi_Crop04_ChanLiangResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Crop04_ChanLiang operation
           */
            public void receiveErrorgetNongQi_Crop04_ChanLiang(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getGeDianHuaDataFile method
            * override this method for handling normal response from getGeDianHuaDataFile operation
            */
           public void receiveResultgetGeDianHuaDataFile(
                    org.tempuri.GetGeDianHuaDataFileResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getGeDianHuaDataFile operation
           */
            public void receiveErrorgetGeDianHuaDataFile(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTongJi_QuYuZhanLimitValueDayCount method
            * override this method for handling normal response from getTongJi_QuYuZhanLimitValueDayCount operation
            */
           public void receiveResultgetTongJi_QuYuZhanLimitValueDayCount(
                    org.tempuri.GetTongJi_QuYuZhanLimitValueDayCountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTongJi_QuYuZhanLimitValueDayCount operation
           */
            public void receiveErrorgetTongJi_QuYuZhanLimitValueDayCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuJingXinHaoData method
            * override this method for handling normal response from getYuJingXinHaoData operation
            */
           public void receiveResultgetYuJingXinHaoData(
                    org.tempuri.GetYuJingXinHaoDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuJingXinHaoData operation
           */
            public void receiveErrorgetYuJingXinHaoData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQiXiangKePu method
            * override this method for handling normal response from getQiXiangKePu operation
            */
           public void receiveResultgetQiXiangKePu(
                    org.tempuri.GetQiXiangKePuResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQiXiangKePu operation
           */
            public void receiveErrorgetQiXiangKePu(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHS8PicList method
            * override this method for handling normal response from getHS8PicList operation
            */
           public void receiveResultgetHS8PicList(
                    org.tempuri.GetHS8PicListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHS8PicList operation
           */
            public void receiveErrorgetHS8PicList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getJiaoTongZhanListByArea method
            * override this method for handling normal response from getJiaoTongZhanListByArea operation
            */
           public void receiveResultgetJiaoTongZhanListByArea(
                    org.tempuri.GetJiaoTongZhanListByAreaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getJiaoTongZhanListByArea operation
           */
            public void receiveErrorgetJiaoTongZhanListByArea(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Mete01_Xun method
            * override this method for handling normal response from getNongQi_Mete01_Xun operation
            */
           public void receiveResultgetNongQi_Mete01_Xun(
                    org.tempuri.GetNongQi_Mete01_XunResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Mete01_Xun operation
           */
            public void receiveErrorgetNongQi_Mete01_Xun(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNongQi_Grass01_FaYuQi method
            * override this method for handling normal response from getNongQi_Grass01_FaYuQi operation
            */
           public void receiveResultgetNongQi_Grass01_FaYuQi(
                    org.tempuri.GetNongQi_Grass01_FaYuQiResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNongQi_Grass01_FaYuQi operation
           */
            public void receiveErrorgetNongQi_Grass01_FaYuQi(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getYuBao_DuanShiYuBao method
            * override this method for handling normal response from getYuBao_DuanShiYuBao operation
            */
           public void receiveResultgetYuBao_DuanShiYuBao(
                    org.tempuri.GetYuBao_DuanShiYuBaoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getYuBao_DuanShiYuBao operation
           */
            public void receiveErrorgetYuBao_DuanShiYuBao(java.lang.Exception e) {
            }
                


    }
    