

/**
 * ShuJuHuanJing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */

    package org.tempuri;

    /*
     *  ShuJuHuanJing java interface
     */

    public interface ShuJuHuanJing {
          

        /**
          * Auto generated method signature
          * 获取邻近省国家站5分钟加密数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_MinuteData构建；arrStationNum为邻近省国家站站号数组，设置54398、54399等；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                    * @param getLinJinShengGuoJiaZhanMinuteDataByStationNum0
                
         */

         
                     public org.tempuri.GetLinJinShengGuoJiaZhanMinuteDataByStationNumResponse getLinJinShengGuoJiaZhanMinuteDataByStationNum(

                        org.tempuri.GetLinJinShengGuoJiaZhanMinuteDataByStationNum getLinJinShengGuoJiaZhanMinuteDataByStationNum0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取邻近省国家站5分钟加密数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_MinuteData构建；arrStationNum为邻近省国家站站号数组，设置54398、54399等；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                * @param getLinJinShengGuoJiaZhanMinuteDataByStationNum0
            
          */
        public void startgetLinJinShengGuoJiaZhanMinuteDataByStationNum(

            org.tempuri.GetLinJinShengGuoJiaZhanMinuteDataByStationNum getLinJinShengGuoJiaZhanMinuteDataByStationNum0,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站旬数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_XunData构建；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；（上旬：yyyy-MM-11、中旬yyyy-MM-21、下旬：yyyy-MM-01）
                    * @param getGuoJiaZhanXunData2
                
         */

         
                     public org.tempuri.GetGuoJiaZhanXunDataResponse getGuoJiaZhanXunData(

                        org.tempuri.GetGuoJiaZhanXunData getGuoJiaZhanXunData2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站旬数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_XunData构建；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；（上旬：yyyy-MM-11、中旬yyyy-MM-21、下旬：yyyy-MM-01）
                * @param getGuoJiaZhanXunData2
            
          */
        public void startgetGuoJiaZhanXunData(

            org.tempuri.GetGuoJiaZhanXunData getGuoJiaZhanXunData2,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取区域站日数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素，利用QXDMS_Col_RegStation_DayData构建；arrStationNum为区域站站号数组；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getQuYuZhanDayDataByQuYuZhanNum4
                
         */

         
                     public org.tempuri.GetQuYuZhanDayDataByQuYuZhanNumResponse getQuYuZhanDayDataByQuYuZhanNum(

                        org.tempuri.GetQuYuZhanDayDataByQuYuZhanNum getQuYuZhanDayDataByQuYuZhanNum4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取区域站日数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素，利用QXDMS_Col_RegStation_DayData构建；arrStationNum为区域站站号数组；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getQuYuZhanDayDataByQuYuZhanNum4
            
          */
        public void startgetQuYuZhanDayDataByQuYuZhanNum(

            org.tempuri.GetQuYuZhanDayDataByQuYuZhanNum getQuYuZhanDayDataByQuYuZhanNum4,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站月数据，参数：resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_MonthData构建；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始时间，格式yyyy-MM-01；endDate为结束时间,格式yyyy-MM-01；
                    * @param getGuoJiaZhanMonthData6
                
         */

         
                     public org.tempuri.GetGuoJiaZhanMonthDataResponse getGuoJiaZhanMonthData(

                        org.tempuri.GetGuoJiaZhanMonthData getGuoJiaZhanMonthData6)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站月数据，参数：resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_MonthData构建；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始时间，格式yyyy-MM-01；endDate为结束时间,格式yyyy-MM-01；
                * @param getGuoJiaZhanMonthData6
            
          */
        public void startgetGuoJiaZhanMonthData(

            org.tempuri.GetGuoJiaZhanMonthData getGuoJiaZhanMonthData6,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取静止卫星文件列表(红外、可见光)，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；typeName为类别，设置IR1、IR2、IR4、VIS之一；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间，格式yyyy-MM-dd HH:00
                    * @param getJingZhiWeiXingOtherPicList8
                
         */

         
                     public org.tempuri.GetJingZhiWeiXingOtherPicListResponse getJingZhiWeiXingOtherPicList(

                        org.tempuri.GetJingZhiWeiXingOtherPicList getJingZhiWeiXingOtherPicList8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取静止卫星文件列表(红外、可见光)，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；typeName为类别，设置IR1、IR2、IR4、VIS之一；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间，格式yyyy-MM-dd HH:00
                * @param getJingZhiWeiXingOtherPicList8
            
          */
        public void startgetJingZhiWeiXingOtherPicList(

            org.tempuri.GetJingZhiWeiXingOtherPicList getJingZhiWeiXingOtherPicList8,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气土壤水分类—土壤水文物理特性，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiSoil01构建；arrStationNum为农气站站号数组，例如53392、53397；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Soil01_TuRangShuiWen10
                
         */

         
                     public org.tempuri.GetNongQi_Soil01_TuRangShuiWenResponse getNongQi_Soil01_TuRangShuiWen(

                        org.tempuri.GetNongQi_Soil01_TuRangShuiWen getNongQi_Soil01_TuRangShuiWen10)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气土壤水分类—土壤水文物理特性，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiSoil01构建；arrStationNum为农气站站号数组，例如53392、53397；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Soil01_TuRangShuiWen10
            
          */
        public void startgetNongQi_Soil01_TuRangShuiWen(

            org.tempuri.GetNongQi_Soil01_TuRangShuiWen getNongQi_Soil01_TuRangShuiWen10,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气灾害类—牧草灾害，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiDisa03构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Disa03_MuCao12
                
         */

         
                     public org.tempuri.GetNongQi_Disa03_MuCaoResponse getNongQi_Disa03_MuCao(

                        org.tempuri.GetNongQi_Disa03_MuCao getNongQi_Disa03_MuCao12)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气灾害类—牧草灾害，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiDisa03构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Disa03_MuCao12
            
          */
        public void startgetNongQi_Disa03_MuCao(

            org.tempuri.GetNongQi_Disa03_MuCao getNongQi_Disa03_MuCao12,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 复杂天气—暴雨，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置国家站或区域站；arrStationNum为查询站号数组，如果stationType为国家站,则arrStationNum利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getTongJi_BaoYu14
                
         */

         
                     public org.tempuri.GetTongJi_BaoYuResponse getTongJi_BaoYu(

                        org.tempuri.GetTongJi_BaoYu getTongJi_BaoYu14)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 复杂天气—暴雨，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置国家站或区域站；arrStationNum为查询站号数组，如果stationType为国家站,则arrStationNum利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getTongJi_BaoYu14
            
          */
        public void startgetTongJi_BaoYu(

            org.tempuri.GetTongJi_BaoYu getTongJi_BaoYu14,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—城镇预报-多时效，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果：json或者xml；arrColumnName为要素数组，利用QXDMS_Col_YuBaoChengZhen构建；arrStationNum为站号数组；shiCi为时次数组：12,24,36,48,60,72,84,96,108,120,132,144,156,168；
                    * @param getYuBao_ChengZhenDuoShiXiaoYuBao16
                
         */

         
                     public org.tempuri.GetYuBao_ChengZhenDuoShiXiaoYuBaoResponse getYuBao_ChengZhenDuoShiXiaoYuBao(

                        org.tempuri.GetYuBao_ChengZhenDuoShiXiaoYuBao getYuBao_ChengZhenDuoShiXiaoYuBao16)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—城镇预报-多时效，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果：json或者xml；arrColumnName为要素数组，利用QXDMS_Col_YuBaoChengZhen构建；arrStationNum为站号数组；shiCi为时次数组：12,24,36,48,60,72,84,96,108,120,132,144,156,168；
                * @param getYuBao_ChengZhenDuoShiXiaoYuBao16
            
          */
        public void startgetYuBao_ChengZhenDuoShiXiaoYuBao(

            org.tempuri.GetYuBao_ChengZhenDuoShiXiaoYuBao getYuBao_ChengZhenDuoShiXiaoYuBao16,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取区域站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，例设置53698、54602等；
                    * @param getQuYuZhanListByGuoJiaZhan18
                
         */

         
                     public org.tempuri.GetQuYuZhanListByGuoJiaZhanResponse getQuYuZhanListByGuoJiaZhan(

                        org.tempuri.GetQuYuZhanListByGuoJiaZhan getQuYuZhanListByGuoJiaZhan18)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取区域站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，例设置53698、54602等；
                * @param getQuYuZhanListByGuoJiaZhan18
            
          */
        public void startgetQuYuZhanListByGuoJiaZhan(

            org.tempuri.GetQuYuZhanListByGuoJiaZhan getQuYuZhanListByGuoJiaZhan18,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气灾害类—农业气象灾害观测，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiDisa01构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Disa01_GuanCe20
                
         */

         
                     public org.tempuri.GetNongQi_Disa01_GuanCeResponse getNongQi_Disa01_GuanCe(

                        org.tempuri.GetNongQi_Disa01_GuanCe getNongQi_Disa01_GuanCe20)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气灾害类—农业气象灾害观测，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiDisa01构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Disa01_GuanCe20
            
          */
        public void startgetNongQi_Disa01_GuanCe(

            org.tempuri.GetNongQi_Disa01_GuanCe getNongQi_Disa01_GuanCe20,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气灾害类—家畜灾害，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiDisa04构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Disa04_JiaChu22
                
         */

         
                     public org.tempuri.GetNongQi_Disa04_JiaChuResponse getNongQi_Disa04_JiaChu(

                        org.tempuri.GetNongQi_Disa04_JiaChu getNongQi_Disa04_JiaChu22)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气灾害类—家畜灾害，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiDisa04构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Disa04_JiaChu22
            
          */
        public void startgetNongQi_Disa04_JiaChu(

            org.tempuri.GetNongQi_Disa04_JiaChu getNongQi_Disa04_JiaChu22,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 复杂天气—高温，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置国家站或区域站；arrStationNum为查询站号数组，如果stationType为国家站,则arrStationNum利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getTongJi_GaoWen24
                
         */

         
                     public org.tempuri.GetTongJi_GaoWenResponse getTongJi_GaoWen(

                        org.tempuri.GetTongJi_GaoWen getTongJi_GaoWen24)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 复杂天气—高温，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置国家站或区域站；arrStationNum为查询站号数组，如果stationType为国家站,则arrStationNum利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getTongJi_GaoWen24
            
          */
        public void startgetTongJi_GaoWen(

            org.tempuri.GetTongJi_GaoWen getTongJi_GaoWen24,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取区域站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_RegStation_HourData构建；arrStationNum为国家站站号数组，例如设置53698等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getQuYuZhanHourData26
                
         */

         
                     public org.tempuri.GetQuYuZhanHourDataResponse getQuYuZhanHourData(

                        org.tempuri.GetQuYuZhanHourData getQuYuZhanHourData26)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取区域站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_RegStation_HourData构建；arrStationNum为国家站站号数组，例如设置53698等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getQuYuZhanHourData26
            
          */
        public void startgetQuYuZhanHourData(

            org.tempuri.GetQuYuZhanHourData getQuYuZhanHourData26,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气牧草类—覆盖度及草层采食度，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass04构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Grass04_FuGaiDu28
                
         */

         
                     public org.tempuri.GetNongQi_Grass04_FuGaiDuResponse getNongQi_Grass04_FuGaiDu(

                        org.tempuri.GetNongQi_Grass04_FuGaiDu getNongQi_Grass04_FuGaiDu28)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气牧草类—覆盖度及草层采食度，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass04构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Grass04_FuGaiDu28
            
          */
        public void startgetNongQi_Grass04_FuGaiDu(

            org.tempuri.GetNongQi_Grass04_FuGaiDu getNongQi_Grass04_FuGaiDu28,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取实况格点化数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrProductType为产品类型数组，利用QXDMS_Col_GeDianHua构建；beginDate为开始时间，据格式为yyyy-MM-dd HH:00；endDate为结束时，格式为yyyy-MM-dd HH:00；
                    * @param getGeDianHuaData30
                
         */

         
                     public org.tempuri.GetGeDianHuaDataResponse getGeDianHuaData(

                        org.tempuri.GetGeDianHuaData getGeDianHuaData30)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取实况格点化数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrProductType为产品类型数组，利用QXDMS_Col_GeDianHua构建；beginDate为开始时间，据格式为yyyy-MM-dd HH:00；endDate为结束时，格式为yyyy-MM-dd HH:00；
                * @param getGeDianHuaData30
            
          */
        public void startgetGeDianHuaData(

            org.tempuri.GetGeDianHuaData getGeDianHuaData30,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取土壤水分站信息，参数：resultType为数据格式类型，设置xml或json；arrCityName为城市名数组，设置石家庄、保定等；
                    * @param getTuRangShuiFenZhanListByCityName32
                
         */

         
                     public org.tempuri.GetTuRangShuiFenZhanListByCityNameResponse getTuRangShuiFenZhanListByCityName(

                        org.tempuri.GetTuRangShuiFenZhanListByCityName getTuRangShuiFenZhanListByCityName32)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取土壤水分站信息，参数：resultType为数据格式类型，设置xml或json；arrCityName为城市名数组，设置石家庄、保定等；
                * @param getTuRangShuiFenZhanListByCityName32
            
          */
        public void startgetTuRangShuiFenZhanListByCityName(

            org.tempuri.GetTuRangShuiFenZhanListByCityName getTuRangShuiFenZhanListByCityName32,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—中期预报，参数：userName为用户名；password为密码；
                    * @param getYuBao_ZhongQiYuBao34
                
         */

         
                     public org.tempuri.GetYuBao_ZhongQiYuBaoResponse getYuBao_ZhongQiYuBao(

                        org.tempuri.GetYuBao_ZhongQiYuBao getYuBao_ZhongQiYuBao34)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—中期预报，参数：userName为用户名；password为密码；
                * @param getYuBao_ZhongQiYuBao34
            
          */
        public void startgetYuBao_ZhongQiYuBao(

            org.tempuri.GetYuBao_ZhongQiYuBao getYuBao_ZhongQiYuBao34,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取邻近省国家站小时据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_HourData构建；arrStationNum为邻近省国家站站号数组，设置54398、54399等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getLinJinShengGuoJiaZhanHourDataByStationNum36
                
         */

         
                     public org.tempuri.GetLinJinShengGuoJiaZhanHourDataByStationNumResponse getLinJinShengGuoJiaZhanHourDataByStationNum(

                        org.tempuri.GetLinJinShengGuoJiaZhanHourDataByStationNum getLinJinShengGuoJiaZhanHourDataByStationNum36)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取邻近省国家站小时据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_HourData构建；arrStationNum为邻近省国家站站号数组，设置54398、54399等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getLinJinShengGuoJiaZhanHourDataByStationNum36
            
          */
        public void startgetLinJinShengGuoJiaZhanHourDataByStationNum(

            org.tempuri.GetLinJinShengGuoJiaZhanHourDataByStationNum getLinJinShengGuoJiaZhanHourDataByStationNum36,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取邻近省国家站信息，参数：resultType为数据格式类型，设置xml或json；arrProvince为省份名称数组，设置山东、山西等；
                    * @param getLinJinShengGuoJiaZhanListByProvince38
                
         */

         
                     public org.tempuri.GetLinJinShengGuoJiaZhanListByProvinceResponse getLinJinShengGuoJiaZhanListByProvince(

                        org.tempuri.GetLinJinShengGuoJiaZhanListByProvince getLinJinShengGuoJiaZhanListByProvince38)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取邻近省国家站信息，参数：resultType为数据格式类型，设置xml或json；arrProvince为省份名称数组，设置山东、山西等；
                * @param getLinJinShengGuoJiaZhanListByProvince38
            
          */
        public void startgetLinJinShengGuoJiaZhanListByProvince(

            org.tempuri.GetLinJinShengGuoJiaZhanListByProvince getLinJinShengGuoJiaZhanListByProvince38,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取站点小时最大雨强，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置国家站、区域站、国家站区域站之一；beginDate为开始时间，格式为yyyy-MM-dd HH:mm；endDate为结束时间，格式为yyyy-MM-dd HH:mm
                    * @param getTongJi_RainMaxInOneHour40
                
         */

         
                     public org.tempuri.GetTongJi_RainMaxInOneHourResponse getTongJi_RainMaxInOneHour(

                        org.tempuri.GetTongJi_RainMaxInOneHour getTongJi_RainMaxInOneHour40)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取站点小时最大雨强，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置国家站、区域站、国家站区域站之一；beginDate为开始时间，格式为yyyy-MM-dd HH:mm；endDate为结束时间，格式为yyyy-MM-dd HH:mm
                * @param getTongJi_RainMaxInOneHour40
            
          */
        public void startgetTongJi_RainMaxInOneHour(

            org.tempuri.GetTongJi_RainMaxInOneHour getTongJi_RainMaxInOneHour40,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取区域站5分钟加密数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_RegStation_MinuteData构建；arrStationNum为区域站站号数组，例如设置B0035、B0036等；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                    * @param getQuYuZhanMinuteData42
                
         */

         
                     public org.tempuri.GetQuYuZhanMinuteDataResponse getQuYuZhanMinuteData(

                        org.tempuri.GetQuYuZhanMinuteData getQuYuZhanMinuteData42)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取区域站5分钟加密数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_RegStation_MinuteData构建；arrStationNum为区域站站号数组，例如设置B0035、B0036等；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                * @param getQuYuZhanMinuteData42
            
          */
        public void startgetQuYuZhanMinuteData(

            org.tempuri.GetQuYuZhanMinuteData getQuYuZhanMinuteData42,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站信息，参数：resultType为数据格式类型，设置xml或json；arrCityName为城市名数组，设置石家庄、保定等；
                    * @param getGuoJiaZhanListByCityName44
                
         */

         
                     public org.tempuri.GetGuoJiaZhanListByCityNameResponse getGuoJiaZhanListByCityName(

                        org.tempuri.GetGuoJiaZhanListByCityName getGuoJiaZhanListByCityName44)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站信息，参数：resultType为数据格式类型，设置xml或json；arrCityName为城市名数组，设置石家庄、保定等；
                * @param getGuoJiaZhanListByCityName44
            
          */
        public void startgetGuoJiaZhanListByCityName(

            org.tempuri.GetGuoJiaZhanListByCityName getGuoJiaZhanListByCityName44,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气牧草类—牧草产量，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass03构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Grass03_ChanLiang46
                
         */

         
                     public org.tempuri.GetNongQi_Grass03_ChanLiangResponse getNongQi_Grass03_ChanLiang(

                        org.tempuri.GetNongQi_Grass03_ChanLiang getNongQi_Grass03_ChanLiang46)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气牧草类—牧草产量，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass03构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Grass03_ChanLiang46
            
          */
        public void startgetNongQi_Grass03_ChanLiang(

            org.tempuri.GetNongQi_Grass03_ChanLiang getNongQi_Grass03_ChanLiang46,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—大城市预报-多时效，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果类型：json或者xml；arrColumnName为要素数组；arrStationNum为站号数组；arrShiCi为时次数组：006、012、018、024；
                    * @param getYuBao_DaChengShiDuoShiXiaoYuBao48
                
         */

         
                     public org.tempuri.GetYuBao_DaChengShiDuoShiXiaoYuBaoResponse getYuBao_DaChengShiDuoShiXiaoYuBao(

                        org.tempuri.GetYuBao_DaChengShiDuoShiXiaoYuBao getYuBao_DaChengShiDuoShiXiaoYuBao48)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—大城市预报-多时效，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果类型：json或者xml；arrColumnName为要素数组；arrStationNum为站号数组；arrShiCi为时次数组：006、012、018、024；
                * @param getYuBao_DaChengShiDuoShiXiaoYuBao48
            
          */
        public void startgetYuBao_DaChengShiDuoShiXiaoYuBao(

            org.tempuri.GetYuBao_DaChengShiDuoShiXiaoYuBao getYuBao_DaChengShiDuoShiXiaoYuBao48,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取区域站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为区域站站号数组，例设置B0035、B0036等；
                    * @param getQuYuZhanListByStationNum50
                
         */

         
                     public org.tempuri.GetQuYuZhanListByStationNumResponse getQuYuZhanListByStationNum(

                        org.tempuri.GetQuYuZhanListByStationNum getQuYuZhanListByStationNum50)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取区域站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为区域站站号数组，例设置B0035、B0036等；
                * @param getQuYuZhanListByStationNum50
            
          */
        public void startgetQuYuZhanListByStationNum(

            org.tempuri.GetQuYuZhanListByStationNum getQuYuZhanListByStationNum50,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取土壤水分站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，设置53689、53784等；
                    * @param getTuRangShuiFenZhanListByGuoJiaZhan52
                
         */

         
                     public org.tempuri.GetTuRangShuiFenZhanListByGuoJiaZhanResponse getTuRangShuiFenZhanListByGuoJiaZhan(

                        org.tempuri.GetTuRangShuiFenZhanListByGuoJiaZhan getTuRangShuiFenZhanListByGuoJiaZhan52)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取土壤水分站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，设置53689、53784等；
                * @param getTuRangShuiFenZhanListByGuoJiaZhan52
            
          */
        public void startgetTuRangShuiFenZhanListByGuoJiaZhan(

            org.tempuri.GetTuRangShuiFenZhanListByGuoJiaZhan getTuRangShuiFenZhanListByGuoJiaZhan52,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取区域站信息，参数：resultType为数据格式类型，设置xml或json；arrCityName为城市名数组，设置石家庄、保定等；
                    * @param getQuYuZhanListByCityName54
                
         */

         
                     public org.tempuri.GetQuYuZhanListByCityNameResponse getQuYuZhanListByCityName(

                        org.tempuri.GetQuYuZhanListByCityName getQuYuZhanListByCityName54)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取区域站信息，参数：resultType为数据格式类型，设置xml或json；arrCityName为城市名数组，设置石家庄、保定等；
                * @param getQuYuZhanListByCityName54
            
          */
        public void startgetQuYuZhanListByCityName(

            org.tempuri.GetQuYuZhanListByCityName getQuYuZhanListByCityName54,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 统计时段内站点灾害性天气站日数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为站号数组；weather为灾害性天气，设置露、霜、结冰、烟幕、霾、浮尘、扬沙、尘卷风、轻雾、闪电、极光、大风、积雪、雷暴、颮、龙卷、沙尘暴、吹雪、雪暴、雾、雾凇、毛毛雨、雨凇、雨、雨夹雪、雪、冰针、米雪、冰粒、阵雨、阵性雨夹雪、阵雪、霰、冰雹、雨凇雾凇混合、雾凇雨凇混合之一；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd
                    * @param getTongJi_WeatherStationCount56
                
         */

         
                     public org.tempuri.GetTongJi_WeatherStationCountResponse getTongJi_WeatherStationCount(

                        org.tempuri.GetTongJi_WeatherStationCount getTongJi_WeatherStationCount56)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 统计时段内站点灾害性天气站日数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为站号数组；weather为灾害性天气，设置露、霜、结冰、烟幕、霾、浮尘、扬沙、尘卷风、轻雾、闪电、极光、大风、积雪、雷暴、颮、龙卷、沙尘暴、吹雪、雪暴、雾、雾凇、毛毛雨、雨凇、雨、雨夹雪、雪、冰针、米雪、冰粒、阵雨、阵性雨夹雪、阵雪、霰、冰雹、雨凇雾凇混合、雾凇雨凇混合之一；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd
                * @param getTongJi_WeatherStationCount56
            
          */
        public void startgetTongJi_WeatherStationCount(

            org.tempuri.GetTongJi_WeatherStationCount getTongJi_WeatherStationCount56,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取指定字段排序的数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；tableName为表信息，利用QXDMS_Col_TongJiData构建；topNum 为记录条数，类似select top 10 的用法；orderField 为排序字段，利用QXDMS_Col_GuoJiaStation_HourData构建；orderType为排序方式，设置asc或者desc；beginDate为开始时间，格式如yyyy-MM-dd HH:00；endDate为结束时间，格式如yyyy-MM-dd；
                    * @param getSelectTopData58
                
         */

         
                     public org.tempuri.GetSelectTopDataResponse getSelectTopData(

                        org.tempuri.GetSelectTopData getSelectTopData58)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取指定字段排序的数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；tableName为表信息，利用QXDMS_Col_TongJiData构建；topNum 为记录条数，类似select top 10 的用法；orderField 为排序字段，利用QXDMS_Col_GuoJiaStation_HourData构建；orderType为排序方式，设置asc或者desc；beginDate为开始时间，格式如yyyy-MM-dd HH:00；endDate为结束时间，格式如yyyy-MM-dd；
                * @param getSelectTopData58
            
          */
        public void startgetSelectTopData(

            org.tempuri.GetSelectTopData getSelectTopData58,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取交通站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为交通站站号数组，设置K573+610等；
                    * @param getJiaoTongZhanListByStationNum60
                
         */

         
                     public org.tempuri.GetJiaoTongZhanListByStationNumResponse getJiaoTongZhanListByStationNum(

                        org.tempuri.GetJiaoTongZhanListByStationNum getJiaoTongZhanListByStationNum60)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取交通站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为交通站站号数组，设置K573+610等；
                * @param getJiaoTongZhanListByStationNum60
            
          */
        public void startgetJiaoTongZhanListByStationNum(

            org.tempuri.GetJiaoTongZhanListByStationNum getJiaoTongZhanListByStationNum60,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取重要天气报数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getWsData62
                
         */

         
                     public org.tempuri.GetWsDataResponse getWsData(

                        org.tempuri.GetWsData getWsData62)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取重要天气报数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getWsData62
            
          */
        public void startgetWsData(

            org.tempuri.GetWsData getWsData62,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 统计时段内站点的最大降温幅度及出现日期，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为站号数组；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd
                    * @param getTongJi_MaxChangeTemp64
                
         */

         
                     public org.tempuri.GetTongJi_MaxChangeTempResponse getTongJi_MaxChangeTemp(

                        org.tempuri.GetTongJi_MaxChangeTemp getTongJi_MaxChangeTemp64)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 统计时段内站点的最大降温幅度及出现日期，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为站号数组；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd
                * @param getTongJi_MaxChangeTemp64
            
          */
        public void startgetTongJi_MaxChangeTemp(

            org.tempuri.GetTongJi_MaxChangeTemp getTongJi_MaxChangeTemp64,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取指定时次的土壤水分小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_TuRangShuiFenStation_HourData构建；arrStationNum为查询站号数组，设置土壤水分站号53593、53399等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；limitHour为限制时次,例如设置08、14、20
                    * @param getTuRangShuiFenZhanHourDataBySetHour66
                
         */

         
                     public org.tempuri.GetTuRangShuiFenZhanHourDataBySetHourResponse getTuRangShuiFenZhanHourDataBySetHour(

                        org.tempuri.GetTuRangShuiFenZhanHourDataBySetHour getTuRangShuiFenZhanHourDataBySetHour66)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取指定时次的土壤水分小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_TuRangShuiFenStation_HourData构建；arrStationNum为查询站号数组，设置土壤水分站号53593、53399等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；limitHour为限制时次,例如设置08、14、20
                * @param getTuRangShuiFenZhanHourDataBySetHour66
            
          */
        public void startgetTuRangShuiFenZhanHourDataBySetHour(

            org.tempuri.GetTuRangShuiFenZhanHourDataBySetHour getTuRangShuiFenZhanHourDataBySetHour66,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气物候类—气象水文现象，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiPheno02构建；arrStationNum为农气站站号数组，例如53399、54405；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Pheno02_ShuiWen68
                
         */

         
                     public org.tempuri.GetNongQi_Pheno02_ShuiWenResponse getNongQi_Pheno02_ShuiWen(

                        org.tempuri.GetNongQi_Pheno02_ShuiWen getNongQi_Pheno02_ShuiWen68)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气物候类—气象水文现象，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiPheno02构建；arrStationNum为农气站站号数组，例如53399、54405；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Pheno02_ShuiWen68
            
          */
        public void startgetNongQi_Pheno02_ShuiWen(

            org.tempuri.GetNongQi_Pheno02_ShuiWen getNongQi_Pheno02_ShuiWen68,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取闪电定位数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_ShanDianDingWeiData构建；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getShanDianDingWeiData70
                
         */

         
                     public org.tempuri.GetShanDianDingWeiDataResponse getShanDianDingWeiData(

                        org.tempuri.GetShanDianDingWeiData getShanDianDingWeiData70)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取闪电定位数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_ShanDianDingWeiData构建；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getShanDianDingWeiData70
            
          */
        public void startgetShanDianDingWeiData(

            org.tempuri.GetShanDianDingWeiData getShanDianDingWeiData70,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气作物类—获取作物生长发育，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop01构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Crop01_FaYuQi72
                
         */

         
                     public org.tempuri.GetNongQi_Crop01_FaYuQiResponse getNongQi_Crop01_FaYuQi(

                        org.tempuri.GetNongQi_Crop01_FaYuQi getNongQi_Crop01_FaYuQi72)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气作物类—获取作物生长发育，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop01构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Crop01_FaYuQi72
            
          */
        public void startgetNongQi_Crop01_FaYuQi(

            org.tempuri.GetNongQi_Crop01_FaYuQi getNongQi_Crop01_FaYuQi72,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 复杂天气—连阴雨，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组，利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getTongJi_LianYinYu74
                
         */

         
                     public org.tempuri.GetTongJi_LianYinYuResponse getTongJi_LianYinYu(

                        org.tempuri.GetTongJi_LianYinYu getTongJi_LianYinYu74)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 复杂天气—连阴雨，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组，利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getTongJi_LianYinYu74
            
          */
        public void startgetTongJi_LianYinYu(

            org.tempuri.GetTongJi_LianYinYu getTongJi_LianYinYu74,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 复杂天气—霜冻，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组,利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getTongJi_ShuangDong76
                
         */

         
                     public org.tempuri.GetTongJi_ShuangDongResponse getTongJi_ShuangDong(

                        org.tempuri.GetTongJi_ShuangDong getTongJi_ShuangDong76)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 复杂天气—霜冻，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组,利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getTongJi_ShuangDong76
            
          */
        public void startgetTongJi_ShuangDong(

            org.tempuri.GetTongJi_ShuangDong getTongJi_ShuangDong76,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取土壤水分站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为土壤水分站站号数组，设置53399、54436等；
                    * @param getTuRangShuiFenZhanListByStationNum78
                
         */

         
                     public org.tempuri.GetTuRangShuiFenZhanListByStationNumResponse getTuRangShuiFenZhanListByStationNum(

                        org.tempuri.GetTuRangShuiFenZhanListByStationNum getTuRangShuiFenZhanListByStationNum78)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取土壤水分站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为土壤水分站站号数组，设置53399、54436等；
                * @param getTuRangShuiFenZhanListByStationNum78
            
          */
        public void startgetTuRangShuiFenZhanListByStationNum(

            org.tempuri.GetTuRangShuiFenZhanListByStationNum getTuRangShuiFenZhanListByStationNum78,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—T639预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；columnName为要素；arrStationNum为站号数组；shiCi为时次：24、48、72、96、120、144、168；
                    * @param getYuBao_T639YuBao80
                
         */

         
                     public org.tempuri.GetYuBao_T639YuBaoResponse getYuBao_T639YuBao(

                        org.tempuri.GetYuBao_T639YuBao getYuBao_T639YuBao80)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—T639预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；columnName为要素；arrStationNum为站号数组；shiCi为时次：24、48、72、96、120、144、168；
                * @param getYuBao_T639YuBao80
            
          */
        public void startgetYuBao_T639YuBao(

            org.tempuri.GetYuBao_T639YuBao getYuBao_T639YuBao80,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取预报格点化站点数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为预报要素，利用QXDMS_Col_GeDianHuaFile构建；fileTime为预报文件时间，设置08或20；hour为预报未来小时数，设置03,06,09,12直到48之一；city为城市名，设置河北、石家庄、保定、衡水之一
                    * @param getGeDianHuaYuBaoStationValue82
                
         */

         
                     public org.tempuri.GetGeDianHuaYuBaoStationValueResponse getGeDianHuaYuBaoStationValue(

                        org.tempuri.GetGeDianHuaYuBaoStationValue getGeDianHuaYuBaoStationValue82)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取预报格点化站点数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为预报要素，利用QXDMS_Col_GeDianHuaFile构建；fileTime为预报文件时间，设置08或20；hour为预报未来小时数，设置03,06,09,12直到48之一；city为城市名，设置河北、石家庄、保定、衡水之一
                * @param getGeDianHuaYuBaoStationValue82
            
          */
        public void startgetGeDianHuaYuBaoStationValue(

            org.tempuri.GetGeDianHuaYuBaoStationValue getGeDianHuaYuBaoStationValue82,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取邻近省区域站信息，参数：resultType为数据格式类型，设置xml或json；arrProvince为省份名称数组，设置山东、山西；
                    * @param getLinJinShengQuYuZhanListByProvince84
                
         */

         
                     public org.tempuri.GetLinJinShengQuYuZhanListByProvinceResponse getLinJinShengQuYuZhanListByProvince(

                        org.tempuri.GetLinJinShengQuYuZhanListByProvince getLinJinShengQuYuZhanListByProvince84)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取邻近省区域站信息，参数：resultType为数据格式类型，设置xml或json；arrProvince为省份名称数组，设置山东、山西；
                * @param getLinJinShengQuYuZhanListByProvince84
            
          */
        public void startgetLinJinShengQuYuZhanListByProvince(

            org.tempuri.GetLinJinShengQuYuZhanListByProvince getLinJinShengQuYuZhanListByProvince84,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—RMAPS_IN图形产品，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；typeName为分类名称，设置2米比湿、1小时降水、2米湿度、2米气温、10米风之一；beginDate为开始时间，格式如yyyy-MM-dd HH:mm；endDate为结束时间，格式如yyyy-MM-dd HH:mm；
                    * @param getRMAPS_IN_PicList86
                
         */

         
                     public org.tempuri.GetRMAPS_IN_PicListResponse getRMAPS_IN_PicList(

                        org.tempuri.GetRMAPS_IN_PicList getRMAPS_IN_PicList86)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—RMAPS_IN图形产品，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；typeName为分类名称，设置2米比湿、1小时降水、2米湿度、2米气温、10米风之一；beginDate为开始时间，格式如yyyy-MM-dd HH:mm；endDate为结束时间，格式如yyyy-MM-dd HH:mm；
                * @param getRMAPS_IN_PicList86
            
          */
        public void startgetRMAPS_IN_PicList(

            org.tempuri.GetRMAPS_IN_PicList getRMAPS_IN_PicList86,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取环境气象站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为环境站站号数组；
                    * @param getHuanJingZhanListByStationNum88
                
         */

         
                     public org.tempuri.GetHuanJingZhanListByStationNumResponse getHuanJingZhanListByStationNum(

                        org.tempuri.GetHuanJingZhanListByStationNum getHuanJingZhanListByStationNum88)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取环境气象站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为环境站站号数组；
                * @param getHuanJingZhanListByStationNum88
            
          */
        public void startgetHuanJingZhanListByStationNum(

            org.tempuri.GetHuanJingZhanListByStationNum getHuanJingZhanListByStationNum88,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取水文站信息，参数：resultType为数据格式类型，设置xml或json；arrCityName为城市名数组，设置石家庄、保定等
                    * @param getShuiWenZhanListByCityName90
                
         */

         
                     public org.tempuri.GetShuiWenZhanListByCityNameResponse getShuiWenZhanListByCityName(

                        org.tempuri.GetShuiWenZhanListByCityName getShuiWenZhanListByCityName90)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取水文站信息，参数：resultType为数据格式类型，设置xml或json；arrCityName为城市名数组，设置石家庄、保定等
                * @param getShuiWenZhanListByCityName90
            
          */
        public void startgetShuiWenZhanListByCityName(

            org.tempuri.GetShuiWenZhanListByCityName getShuiWenZhanListByCityName90,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站日数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_DayData构建；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getGuoJiaZhanDayData92
                
         */

         
                     public org.tempuri.GetGuoJiaZhanDayDataResponse getGuoJiaZhanDayData(

                        org.tempuri.GetGuoJiaZhanDayData getGuoJiaZhanDayData92)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站日数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_DayData构建；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getGuoJiaZhanDayData92
            
          */
        public void startgetGuoJiaZhanDayData(

            org.tempuri.GetGuoJiaZhanDayData getGuoJiaZhanDayData92,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取环境气象日数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_HuanJingStation_DayData构建；arrStationNum为环境站站号数组；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getHuanJingZhanDayData94
                
         */

         
                     public org.tempuri.GetHuanJingZhanDayDataResponse getHuanJingZhanDayData(

                        org.tempuri.GetHuanJingZhanDayData getHuanJingZhanDayData94)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取环境气象日数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_HuanJingStation_DayData构建；arrStationNum为环境站站号数组；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getHuanJingZhanDayData94
            
          */
        public void startgetHuanJingZhanDayData(

            org.tempuri.GetHuanJingZhanDayData getHuanJingZhanDayData94,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气牧草类—牧草生长高度，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass02构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Grass02_GaoDu96
                
         */

         
                     public org.tempuri.GetNongQi_Grass02_GaoDuResponse getNongQi_Grass02_GaoDu(

                        org.tempuri.GetNongQi_Grass02_GaoDu getNongQi_Grass02_GaoDu96)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气牧草类—牧草生长高度，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass02构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Grass02_GaoDu96
            
          */
        public void startgetNongQi_Grass02_GaoDu(

            org.tempuri.GetNongQi_Grass02_GaoDu getNongQi_Grass02_GaoDu96,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取环境气象站信息，参数：resultType为数据格式类型，设置xml或json；arrCityName为城市名数组，设置石家庄、保定等；
                    * @param getHuanJingZhanListByCityName98
                
         */

         
                     public org.tempuri.GetHuanJingZhanListByCityNameResponse getHuanJingZhanListByCityName(

                        org.tempuri.GetHuanJingZhanListByCityName getHuanJingZhanListByCityName98)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取环境气象站信息，参数：resultType为数据格式类型，设置xml或json；arrCityName为城市名数组，设置石家庄、保定等；
                * @param getHuanJingZhanListByCityName98
            
          */
        public void startgetHuanJingZhanListByCityName(

            org.tempuri.GetHuanJingZhanListByCityName getHuanJingZhanListByCityName98,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 复杂天气—强对流，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组，利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getTongJi_QiangDuiLiu100
                
         */

         
                     public org.tempuri.GetTongJi_QiangDuiLiuResponse getTongJi_QiangDuiLiu(

                        org.tempuri.GetTongJi_QiangDuiLiu getTongJi_QiangDuiLiu100)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 复杂天气—强对流，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组，利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getTongJi_QiangDuiLiu100
            
          */
        public void startgetTongJi_QiangDuiLiu(

            org.tempuri.GetTongJi_QiangDuiLiu getTongJi_QiangDuiLiu100,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJianStation_HourData构建；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getGuoJiaZhanHourData102
                
         */

         
                     public org.tempuri.GetGuoJiaZhanHourDataResponse getGuoJiaZhanHourData(

                        org.tempuri.GetGuoJiaZhanHourData getGuoJiaZhanHourData102)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJianStation_HourData构建；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getGuoJiaZhanHourData102
            
          */
        public void startgetGuoJiaZhanHourData(

            org.tempuri.GetGuoJiaZhanHourData getGuoJiaZhanHourData102,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取全国国家站信息，参数：resultType为数据格式类型，设置xml或json；arrProvince为省份名称数组，设置广西、浙江等；
                    * @param getChinaGuoJiaZhanListByProvince104
                
         */

         
                     public org.tempuri.GetChinaGuoJiaZhanListByProvinceResponse getChinaGuoJiaZhanListByProvince(

                        org.tempuri.GetChinaGuoJiaZhanListByProvince getChinaGuoJiaZhanListByProvince104)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取全国国家站信息，参数：resultType为数据格式类型，设置xml或json；arrProvince为省份名称数组，设置广西、浙江等；
                * @param getChinaGuoJiaZhanListByProvince104
            
          */
        public void startgetChinaGuoJiaZhanListByProvince(

            org.tempuri.GetChinaGuoJiaZhanListByProvince getChinaGuoJiaZhanListByProvince104,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 小气候站点信息，参数：arrCity为城市名数组，设置石家庄、保定等；resultType为数据格式类型，设置xml或json
                    * @param getXiaoQiHouStationList106
                
         */

         
                     public org.tempuri.GetXiaoQiHouStationListResponse getXiaoQiHouStationList(

                        org.tempuri.GetXiaoQiHouStationList getXiaoQiHouStationList106)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 小气候站点信息，参数：arrCity为城市名数组，设置石家庄、保定等；resultType为数据格式类型，设置xml或json
                * @param getXiaoQiHouStationList106
            
          */
        public void startgetXiaoQiHouStationList(

            org.tempuri.GetXiaoQiHouStationList getXiaoQiHouStationList106,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 复杂天气—干旱，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组,利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getTongJi_GanHan108
                
         */

         
                     public org.tempuri.GetTongJi_GanHanResponse getTongJi_GanHan(

                        org.tempuri.GetTongJi_GanHan getTongJi_GanHan108)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 复杂天气—干旱，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组,利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getTongJi_GanHan108
            
          */
        public void startgetTongJi_GanHan(

            org.tempuri.GetTongJi_GanHan getTongJi_GanHan108,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—大城市预报，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果类型：json或者xml；arrColumnName为要素数组；arrStationNum为站号数组；shiCi为时次：006、012、018、024；
                    * @param getYuBao_DaChengShiYuBao110
                
         */

         
                     public org.tempuri.GetYuBao_DaChengShiYuBaoResponse getYuBao_DaChengShiYuBao(

                        org.tempuri.GetYuBao_DaChengShiYuBao getYuBao_DaChengShiYuBao110)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—大城市预报，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果类型：json或者xml；arrColumnName为要素数组；arrStationNum为站号数组；shiCi为时次：006、012、018、024；
                * @param getYuBao_DaChengShiYuBao110
            
          */
        public void startgetYuBao_DaChengShiYuBao(

            org.tempuri.GetYuBao_DaChengShiYuBao getYuBao_DaChengShiYuBao110,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气牧草类—家畜膘情等级调查，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass06构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Grass06_BiaoQing112
                
         */

         
                     public org.tempuri.GetNongQi_Grass06_BiaoQingResponse getNongQi_Grass06_BiaoQing(

                        org.tempuri.GetNongQi_Grass06_BiaoQing getNongQi_Grass06_BiaoQing112)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气牧草类—家畜膘情等级调查，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass06构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Grass06_BiaoQing112
            
          */
        public void startgetNongQi_Grass06_BiaoQing(

            org.tempuri.GetNongQi_Grass06_BiaoQing getNongQi_Grass06_BiaoQing112,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取1981至2010整编月数据，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，设置53698、54602等；arrColumnName为查询要素数组，利用QXDMS_Col_30YearZBMonth构建；beginMonth为开始月份；endMonth为结束月份；
                    * @param get1981_2010HistroyMonthData114
                
         */

         
                     public org.tempuri.Get1981_2010HistroyMonthDataResponse get1981_2010HistroyMonthData(

                        org.tempuri.Get1981_2010HistroyMonthData get1981_2010HistroyMonthData114)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取1981至2010整编月数据，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，设置53698、54602等；arrColumnName为查询要素数组，利用QXDMS_Col_30YearZBMonth构建；beginMonth为开始月份；endMonth为结束月份；
                * @param get1981_2010HistroyMonthData114
            
          */
        public void startget1981_2010HistroyMonthData(

            org.tempuri.Get1981_2010HistroyMonthData get1981_2010HistroyMonthData114,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取指定条件下区域站日数据的站点数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为要素，利用QXDMS_Col_RegStation_DayData构建；arrStationNum为站号数组；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd；minValue：(double)指定条件最小值；maxValue：(double)指定条件最大值
                    * @param getTongJi_QuYuZhanLimitValueStationCount116
                
         */

         
                     public org.tempuri.GetTongJi_QuYuZhanLimitValueStationCountResponse getTongJi_QuYuZhanLimitValueStationCount(

                        org.tempuri.GetTongJi_QuYuZhanLimitValueStationCount getTongJi_QuYuZhanLimitValueStationCount116)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取指定条件下区域站日数据的站点数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为要素，利用QXDMS_Col_RegStation_DayData构建；arrStationNum为站号数组；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd；minValue：(double)指定条件最小值；maxValue：(double)指定条件最大值
                * @param getTongJi_QuYuZhanLimitValueStationCount116
            
          */
        public void startgetTongJi_QuYuZhanLimitValueStationCount(

            org.tempuri.GetTongJi_QuYuZhanLimitValueStationCount getTongJi_QuYuZhanLimitValueStationCount116,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 复杂天气—干热风，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置国家站或区域站；arrStationNum为查询站号数组，如果stationType为国家站,则arrStationNum利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getTongJi_GanReFeng118
                
         */

         
                     public org.tempuri.GetTongJi_GanReFengResponse getTongJi_GanReFeng(

                        org.tempuri.GetTongJi_GanReFeng getTongJi_GanReFeng118)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 复杂天气—干热风，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置国家站或区域站；arrStationNum为查询站号数组，如果stationType为国家站,则arrStationNum利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getTongJi_GanReFeng118
            
          */
        public void startgetTongJi_GanReFeng(

            org.tempuri.GetTongJi_GanReFeng getTongJi_GanReFeng118,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—城镇预报，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果：json或者xml；arrColumnName为要素数组，利用QXDMS_Col_YuBaoChengZhen构建；arrStationNum为站号数组；shiCi为时次：12,24,36,48,60,72,84,96,108,120,132,144,156,168；
                    * @param getYuBao_ChengZhenYuBao120
                
         */

         
                     public org.tempuri.GetYuBao_ChengZhenYuBaoResponse getYuBao_ChengZhenYuBao(

                        org.tempuri.GetYuBao_ChengZhenYuBao getYuBao_ChengZhenYuBao120)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—城镇预报，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果：json或者xml；arrColumnName为要素数组，利用QXDMS_Col_YuBaoChengZhen构建；arrStationNum为站号数组；shiCi为时次：12,24,36,48,60,72,84,96,108,120,132,144,156,168；
                * @param getYuBao_ChengZhenYuBao120
            
          */
        public void startgetYuBao_ChengZhenYuBao(

            org.tempuri.GetYuBao_ChengZhenYuBao getYuBao_ChengZhenYuBao120,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取GPS水汽数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GPSData构建；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；quyu：可以为空，为空时为全国范围内。显示的11个地市及河北全图，拼音的首字母大写，例如：ShiJiaZhuang、BaoDing等；
                    * @param getGPSData122
                
         */

         
                     public org.tempuri.GetGPSDataResponse getGPSData(

                        org.tempuri.GetGPSData getGPSData122)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取GPS水汽数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GPSData构建；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；quyu：可以为空，为空时为全国范围内。显示的11个地市及河北全图，拼音的首字母大写，例如：ShiJiaZhuang、BaoDing等；
                * @param getGPSData122
            
          */
        public void startgetGPSData(

            org.tempuri.GetGPSData getGPSData122,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取交通站气象观测数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_JiaoTongQiXiangData构建；arrStationNum为交通站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                    * @param getJiaoTongQiXiangData124
                
         */

         
                     public org.tempuri.GetJiaoTongQiXiangDataResponse getJiaoTongQiXiangData(

                        org.tempuri.GetJiaoTongQiXiangData getJiaoTongQiXiangData124)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取交通站气象观测数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_JiaoTongQiXiangData构建；arrStationNum为交通站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                * @param getJiaoTongQiXiangData124
            
          */
        public void startgetJiaoTongQiXiangData(

            org.tempuri.GetJiaoTongQiXiangData getJiaoTongQiXiangData124,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站季数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；columnName为查询要素，利用QXDMS_Col_GuoJiaStation_MonthData构建；function：统计方式，sum、max、min、avg等；arrStationNum为国家站站号数组，设置53698、54602等；arrJiJie为查询的季节数组，设置春季、夏季、秋季、冬季；beginYear为开始年份，如2012；endYear为结束年份,如2014；
                    * @param getTongJi_JiData126
                
         */

         
                     public org.tempuri.GetTongJi_JiDataResponse getTongJi_JiData(

                        org.tempuri.GetTongJi_JiData getTongJi_JiData126)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站季数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；columnName为查询要素，利用QXDMS_Col_GuoJiaStation_MonthData构建；function：统计方式，sum、max、min、avg等；arrStationNum为国家站站号数组，设置53698、54602等；arrJiJie为查询的季节数组，设置春季、夏季、秋季、冬季；beginYear为开始年份，如2012；endYear为结束年份,如2014；
                * @param getTongJi_JiData126
            
          */
        public void startgetTongJi_JiData(

            org.tempuri.GetTongJi_JiData getTongJi_JiData126,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取统计数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；tableInfo为表信息，利用QXDMS_Col_TongJiData构建；arrColumnName为查询要素数组，例如tableInfo设置QXDMS_Col_TongJiData.国家站小时数据,则arrColumnName利用QXDMS_Col_GuoJiaStation_HourData构建；arrSqlFunction为聚合函数数组，例如Avg、Sum、Max、Min；arrStationNum为查询站号数组，例如tableInfo设置QXDMS_Col_TongJiData.国家站小时数据,则arrStationNum利用国家站站号构建；beginDate为开始时间，小时数据格式为yyyy-MM-dd HH:00、日数据格式为yyyy-MM-dd；endDate为结束时间,小时数据格式为yyyy-MM-dd HH:00、日数据格式为yyyy-MM-dd；
                    * @param getTongJi_Data128
                
         */

         
                     public org.tempuri.GetTongJi_DataResponse getTongJi_Data(

                        org.tempuri.GetTongJi_Data getTongJi_Data128)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取统计数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；tableInfo为表信息，利用QXDMS_Col_TongJiData构建；arrColumnName为查询要素数组，例如tableInfo设置QXDMS_Col_TongJiData.国家站小时数据,则arrColumnName利用QXDMS_Col_GuoJiaStation_HourData构建；arrSqlFunction为聚合函数数组，例如Avg、Sum、Max、Min；arrStationNum为查询站号数组，例如tableInfo设置QXDMS_Col_TongJiData.国家站小时数据,则arrStationNum利用国家站站号构建；beginDate为开始时间，小时数据格式为yyyy-MM-dd HH:00、日数据格式为yyyy-MM-dd；endDate为结束时间,小时数据格式为yyyy-MM-dd HH:00、日数据格式为yyyy-MM-dd；
                * @param getTongJi_Data128
            
          */
        public void startgetTongJi_Data(

            org.tempuri.GetTongJi_Data getTongJi_Data128,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取降水专题统计数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组可以为null全部；arrStationType为站点类型数组，可传递国家站、区域站；sqlFunction为聚合函数，例如Avg、Sum、Max、Min；beginDate为开始时间，格式为yyyy-MM-dd HH:mm；endDate为结束时间,格式为yyyy-MM-dd HH:mm；
                    * @param getTongJiData_ZhuanTi_Rain130
                
         */

         
                     public org.tempuri.GetTongJiData_ZhuanTi_RainResponse getTongJiData_ZhuanTi_Rain(

                        org.tempuri.GetTongJiData_ZhuanTi_Rain getTongJiData_ZhuanTi_Rain130)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取降水专题统计数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组可以为null全部；arrStationType为站点类型数组，可传递国家站、区域站；sqlFunction为聚合函数，例如Avg、Sum、Max、Min；beginDate为开始时间，格式为yyyy-MM-dd HH:mm；endDate为结束时间,格式为yyyy-MM-dd HH:mm；
                * @param getTongJiData_ZhuanTi_Rain130
            
          */
        public void startgetTongJiData_ZhuanTi_Rain(

            org.tempuri.GetTongJiData_ZhuanTi_Rain getTongJiData_ZhuanTi_Rain130,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取区域站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_RegStation_HourData构建；arrStationNum为区域站站号数组，例如设置B0035、B0036等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getQuYuZhanHourDataByQuYuZhanNum132
                
         */

         
                     public org.tempuri.GetQuYuZhanHourDataByQuYuZhanNumResponse getQuYuZhanHourDataByQuYuZhanNum(

                        org.tempuri.GetQuYuZhanHourDataByQuYuZhanNum getQuYuZhanHourDataByQuYuZhanNum132)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取区域站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_RegStation_HourData构建；arrStationNum为区域站站号数组，例如设置B0035、B0036等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getQuYuZhanHourDataByQuYuZhanNum132
            
          */
        public void startgetQuYuZhanHourDataByQuYuZhanNum(

            org.tempuri.GetQuYuZhanHourDataByQuYuZhanNum getQuYuZhanHourDataByQuYuZhanNum132,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—城镇预报-传参日期，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果：json或者xml；arrColumnName为要素数组，利用QXDMS_Col_YuBaoChengZhen构建；arrStationNum为站号数组；shiCi为时次：12,24,36,48,60,72,84,96,108,120,132,144,156,168；observTime为起报日期时间：[日期+起报时次(08或者20,特别的市台有12)]yyyyMMddHH
                    * @param getYuBao_ChengZhenYuBaoDate134
                
         */

         
                     public org.tempuri.GetYuBao_ChengZhenYuBaoDateResponse getYuBao_ChengZhenYuBaoDate(

                        org.tempuri.GetYuBao_ChengZhenYuBaoDate getYuBao_ChengZhenYuBaoDate134)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—城镇预报-传参日期，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果：json或者xml；arrColumnName为要素数组，利用QXDMS_Col_YuBaoChengZhen构建；arrStationNum为站号数组；shiCi为时次：12,24,36,48,60,72,84,96,108,120,132,144,156,168；observTime为起报日期时间：[日期+起报时次(08或者20,特别的市台有12)]yyyyMMddHH
                * @param getYuBao_ChengZhenYuBaoDate134
            
          */
        public void startgetYuBao_ChengZhenYuBaoDate(

            org.tempuri.GetYuBao_ChengZhenYuBaoDate getYuBao_ChengZhenYuBaoDate134,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取数据订正信息，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为站点数组，全部站点可设置null或1位长度空数组；beginDate为开始日期，格式为yyyy-MM-dd HH:mm；endDate为结束日期，格式为yyyy-MM-dd HH:mm；stationType为数据类型，设置国家站或区域站据之一
                    * @param getDataModify136
                
         */

         
                     public org.tempuri.GetDataModifyResponse getDataModify(

                        org.tempuri.GetDataModify getDataModify136)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取数据订正信息，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为站点数组，全部站点可设置null或1位长度空数组；beginDate为开始日期，格式为yyyy-MM-dd HH:mm；endDate为结束日期，格式为yyyy-MM-dd HH:mm；stationType为数据类型，设置国家站或区域站据之一
                * @param getDataModify136
            
          */
        public void startgetDataModify(

            org.tempuri.GetDataModify getDataModify136,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—临近预报，参数：userName为用户名；password为密码；
                    * @param getYuBao_LinJinYuBao138
                
         */

         
                     public org.tempuri.GetYuBao_LinJinYuBaoResponse getYuBao_LinJinYuBao(

                        org.tempuri.GetYuBao_LinJinYuBao getYuBao_LinJinYuBao138)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—临近预报，参数：userName为用户名；password为密码；
                * @param getYuBao_LinJinYuBao138
            
          */
        public void startgetYuBao_LinJinYuBao(

            org.tempuri.GetYuBao_LinJinYuBao getYuBao_LinJinYuBao138,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取全国国家站5分钟加密数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_MinuteData构建；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间,格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                    * @param getChinaGuoJiaZhanMinuteData140
                
         */

         
                     public org.tempuri.GetChinaGuoJiaZhanMinuteDataResponse getChinaGuoJiaZhanMinuteData(

                        org.tempuri.GetChinaGuoJiaZhanMinuteData getChinaGuoJiaZhanMinuteData140)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取全国国家站5分钟加密数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_MinuteData构建；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间,格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                * @param getChinaGuoJiaZhanMinuteData140
            
          */
        public void startgetChinaGuoJiaZhanMinuteData(

            org.tempuri.GetChinaGuoJiaZhanMinuteData getChinaGuoJiaZhanMinuteData140,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取指定条件下国家站日数据的站点数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为要素，利用QXDMS_Col_GuoJiaStation_DayData构建；arrStationNum为站号数组；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd；minValue：(double)指定条件最小值；maxValue：(double)指定条件最大值
                    * @param getTongJi_LimitValueStationCount142
                
         */

         
                     public org.tempuri.GetTongJi_LimitValueStationCountResponse getTongJi_LimitValueStationCount(

                        org.tempuri.GetTongJi_LimitValueStationCount getTongJi_LimitValueStationCount142)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取指定条件下国家站日数据的站点数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为要素，利用QXDMS_Col_GuoJiaStation_DayData构建；arrStationNum为站号数组；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd；minValue：(double)指定条件最小值；maxValue：(double)指定条件最大值
                * @param getTongJi_LimitValueStationCount142
            
          */
        public void startgetTongJi_LimitValueStationCount(

            org.tempuri.GetTongJi_LimitValueStationCount getTongJi_LimitValueStationCount142,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—短期预报，参数：userName为用户名；password为密码；
                    * @param getYuBao_DuanQiYuBao144
                
         */

         
                     public org.tempuri.GetYuBao_DuanQiYuBaoResponse getYuBao_DuanQiYuBao(

                        org.tempuri.GetYuBao_DuanQiYuBao getYuBao_DuanQiYuBao144)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—短期预报，参数：userName为用户名；password为密码；
                * @param getYuBao_DuanQiYuBao144
            
          */
        public void startgetYuBao_DuanQiYuBao(

            org.tempuri.GetYuBao_DuanQiYuBao getYuBao_DuanQiYuBao144,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取雷达估测降水图文件列表(最新20幅图像)，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                    * @param getLeiDaRainPicList146
                
         */

         
                     public org.tempuri.GetLeiDaRainPicListResponse getLeiDaRainPicList(

                        org.tempuri.GetLeiDaRainPicList getLeiDaRainPicList146)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取雷达估测降水图文件列表(最新20幅图像)，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                * @param getLeiDaRainPicList146
            
          */
        public void startgetLeiDaRainPicList(

            org.tempuri.GetLeiDaRainPicList getLeiDaRainPicList146,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取水文站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站号数组，设置53698、54602等
                    * @param getShuiWenZhanListByGuoJiaZhan148
                
         */

         
                     public org.tempuri.GetShuiWenZhanListByGuoJiaZhanResponse getShuiWenZhanListByGuoJiaZhan(

                        org.tempuri.GetShuiWenZhanListByGuoJiaZhan getShuiWenZhanListByGuoJiaZhan148)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取水文站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站号数组，设置53698、54602等
                * @param getShuiWenZhanListByGuoJiaZhan148
            
          */
        public void startgetShuiWenZhanListByGuoJiaZhan(

            org.tempuri.GetShuiWenZhanListByGuoJiaZhan getShuiWenZhanListByGuoJiaZhan148,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气基本气象要素—月气象要素，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiMete02构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Mete02_Month150
                
         */

         
                     public org.tempuri.GetNongQi_Mete02_MonthResponse getNongQi_Mete02_Month(

                        org.tempuri.GetNongQi_Mete02_Month getNongQi_Mete02_Month150)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气基本气象要素—月气象要素，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiMete02构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Mete02_Month150
            
          */
        public void startgetNongQi_Mete02_Month(

            org.tempuri.GetNongQi_Mete02_Month getNongQi_Mete02_Month150,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取指定条件下国家站日数据的日数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为要素，利用QXDMS_Col_GuoJiaStation_DayData构建；arrStationNum为站号数组；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd；minValue：(double)指定条件最小值；maxValue：(double)指定条件最大值
                    * @param getTongJi_LimitValueDayCount152
                
         */

         
                     public org.tempuri.GetTongJi_LimitValueDayCountResponse getTongJi_LimitValueDayCount(

                        org.tempuri.GetTongJi_LimitValueDayCount getTongJi_LimitValueDayCount152)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取指定条件下国家站日数据的日数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为要素，利用QXDMS_Col_GuoJiaStation_DayData构建；arrStationNum为站号数组；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd；minValue：(double)指定条件最小值；maxValue：(double)指定条件最大值
                * @param getTongJi_LimitValueDayCount152
            
          */
        public void startgetTongJi_LimitValueDayCount(

            org.tempuri.GetTongJi_LimitValueDayCount getTongJi_LimitValueDayCount152,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 统计国家站有效积温，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间，格式为yyyy-MM-dd；endDate为结束时间，格式为yyyy-MM-dd；limitValue为限定值，例如求大于等于10℃的有效积温，设置10
                    * @param getTongJi_EffectiveAccumulatedTemperature154
                
         */

         
                     public org.tempuri.GetTongJi_EffectiveAccumulatedTemperatureResponse getTongJi_EffectiveAccumulatedTemperature(

                        org.tempuri.GetTongJi_EffectiveAccumulatedTemperature getTongJi_EffectiveAccumulatedTemperature154)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 统计国家站有效积温，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间，格式为yyyy-MM-dd；endDate为结束时间，格式为yyyy-MM-dd；limitValue为限定值，例如求大于等于10℃的有效积温，设置10
                * @param getTongJi_EffectiveAccumulatedTemperature154
            
          */
        public void startgetTongJi_EffectiveAccumulatedTemperature(

            org.tempuri.GetTongJi_EffectiveAccumulatedTemperature getTongJi_EffectiveAccumulatedTemperature154,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—WRF预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；arrColumnName为要素；shiCi为时次：24、48、72；quYu：不能为空，显示的11个地市及河北全图，拼音的首字母大写，例如：ShiJiaZhuang、BaoDing等；
                    * @param getYuBao_WrfYuBao156
                
         */

         
                     public org.tempuri.GetYuBao_WrfYuBaoResponse getYuBao_WrfYuBao(

                        org.tempuri.GetYuBao_WrfYuBao getYuBao_WrfYuBao156)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—WRF预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；arrColumnName为要素；shiCi为时次：24、48、72；quYu：不能为空，显示的11个地市及河北全图，拼音的首字母大写，例如：ShiJiaZhuang、BaoDing等；
                * @param getYuBao_WrfYuBao156
            
          */
        public void startgetYuBao_WrfYuBao(

            org.tempuri.GetYuBao_WrfYuBao getYuBao_WrfYuBao156,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取全国国家站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJianStation_HourData构建；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getChinaGuoJiaZhanHourData158
                
         */

         
                     public org.tempuri.GetChinaGuoJiaZhanHourDataResponse getChinaGuoJiaZhanHourData(

                        org.tempuri.GetChinaGuoJiaZhanHourData getChinaGuoJiaZhanHourData158)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取全国国家站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJianStation_HourData构建；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getChinaGuoJiaZhanHourData158
            
          */
        public void startgetChinaGuoJiaZhanHourData(

            org.tempuri.GetChinaGuoJiaZhanHourData getChinaGuoJiaZhanHourData158,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站年数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_YearData构建；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始时间，格式yyyy-01-01；endDate为结束时间,格式yyyy-01-01；
                    * @param getGuoJiaZhanYearData160
                
         */

         
                     public org.tempuri.GetGuoJiaZhanYearDataResponse getGuoJiaZhanYearData(

                        org.tempuri.GetGuoJiaZhanYearData getGuoJiaZhanYearData160)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站年数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_YearData构建；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始时间，格式yyyy-01-01；endDate为结束时间,格式yyyy-01-01；
                * @param getGuoJiaZhanYearData160
            
          */
        public void startgetGuoJiaZhanYearData(

            org.tempuri.GetGuoJiaZhanYearData getGuoJiaZhanYearData160,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—INCA预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；arrColumnName为要素；quYu：不能为空，显示的11个地市及河北全图，拼音的首字母大写，例如：ShiJiaZhuang、BaoDing等；
                    * @param getYuBao_IncaYuBao162
                
         */

         
                     public org.tempuri.GetYuBao_IncaYuBaoResponse getYuBao_IncaYuBao(

                        org.tempuri.GetYuBao_IncaYuBao getYuBao_IncaYuBao162)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—INCA预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；arrColumnName为要素；quYu：不能为空，显示的11个地市及河北全图，拼音的首字母大写，例如：ShiJiaZhuang、BaoDing等；
                * @param getYuBao_IncaYuBao162
            
          */
        public void startgetYuBao_IncaYuBao(

            org.tempuri.GetYuBao_IncaYuBao getYuBao_IncaYuBao162,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，设置53698等；
                    * @param getGuoJiaZhanListByStationNum164
                
         */

         
                     public org.tempuri.GetGuoJiaZhanListByStationNumResponse getGuoJiaZhanListByStationNum(

                        org.tempuri.GetGuoJiaZhanListByStationNum getGuoJiaZhanListByStationNum164)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，设置53698等；
                * @param getGuoJiaZhanListByStationNum164
            
          */
        public void startgetGuoJiaZhanListByStationNum(

            org.tempuri.GetGuoJiaZhanListByStationNum getGuoJiaZhanListByStationNum164,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 统计时段内站点灾害性天气日数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为站号数组；weather为灾害性天气，设置露、霜、结冰、烟幕、霾、浮尘、扬沙、尘卷风、轻雾、闪电、极光、大风、积雪、雷暴、颮、龙卷、沙尘暴、吹雪、雪暴、雾、雾凇、毛毛雨、雨凇、雨、雨夹雪、雪、冰针、米雪、冰粒、阵雨、阵性雨夹雪、阵雪、霰、冰雹、雨凇雾凇混合、雾凇雨凇混合之一；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd
                    * @param getTongJi_WeatherDayCount166
                
         */

         
                     public org.tempuri.GetTongJi_WeatherDayCountResponse getTongJi_WeatherDayCount(

                        org.tempuri.GetTongJi_WeatherDayCount getTongJi_WeatherDayCount166)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 统计时段内站点灾害性天气日数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为站号数组；weather为灾害性天气，设置露、霜、结冰、烟幕、霾、浮尘、扬沙、尘卷风、轻雾、闪电、极光、大风、积雪、雷暴、颮、龙卷、沙尘暴、吹雪、雪暴、雾、雾凇、毛毛雨、雨凇、雨、雨夹雪、雪、冰针、米雪、冰粒、阵雨、阵性雨夹雪、阵雪、霰、冰雹、雨凇雾凇混合、雾凇雨凇混合之一；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd
                * @param getTongJi_WeatherDayCount166
            
          */
        public void startgetTongJi_WeatherDayCount(

            org.tempuri.GetTongJi_WeatherDayCount getTongJi_WeatherDayCount166,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气灾害类—农业气象灾害调查，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiDisa02构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Disa02_DiaoCha168
                
         */

         
                     public org.tempuri.GetNongQi_Disa02_DiaoChaResponse getNongQi_Disa02_DiaoCha(

                        org.tempuri.GetNongQi_Disa02_DiaoCha getNongQi_Disa02_DiaoCha168)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气灾害类—农业气象灾害调查，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiDisa02构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Disa02_DiaoCha168
            
          */
        public void startgetNongQi_Disa02_DiaoCha(

            org.tempuri.GetNongQi_Disa02_DiaoCha getNongQi_Disa02_DiaoCha168,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取区域站日数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素，利用QXDMS_Col_RegStation_DayData构建；arrStationNum为国家站站号数组,设置53698、54602等；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getQuYuZhanDayDataByGuoJiaZhanNum170
                
         */

         
                     public org.tempuri.GetQuYuZhanDayDataByGuoJiaZhanNumResponse getQuYuZhanDayDataByGuoJiaZhanNum(

                        org.tempuri.GetQuYuZhanDayDataByGuoJiaZhanNum getQuYuZhanDayDataByGuoJiaZhanNum170)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取区域站日数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素，利用QXDMS_Col_RegStation_DayData构建；arrStationNum为国家站站号数组,设置53698、54602等；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getQuYuZhanDayDataByGuoJiaZhanNum170
            
          */
        public void startgetQuYuZhanDayDataByGuoJiaZhanNum(

            org.tempuri.GetQuYuZhanDayDataByGuoJiaZhanNum getQuYuZhanDayDataByGuoJiaZhanNum170,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取自动土壤水分小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_TuRangShuiFenStation_HourData构建；arrStationNum为查询站号数组，设置土壤水分站号53593、53399等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getTuRangShuiFenZhanHourData172
                
         */

         
                     public org.tempuri.GetTuRangShuiFenZhanHourDataResponse getTuRangShuiFenZhanHourData(

                        org.tempuri.GetTuRangShuiFenZhanHourData getTuRangShuiFenZhanHourData172)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取自动土壤水分小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_TuRangShuiFenStation_HourData构建；arrStationNum为查询站号数组，设置土壤水分站号53593、53399等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getTuRangShuiFenZhanHourData172
            
          */
        public void startgetTuRangShuiFenZhanHourData(

            org.tempuri.GetTuRangShuiFenZhanHourData getTuRangShuiFenZhanHourData172,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取GPS水汽数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；id为数据存储中的已知序列；
                    * @param getGPSDataById174
                
         */

         
                     public org.tempuri.GetGPSDataByIdResponse getGPSDataById(

                        org.tempuri.GetGPSDataById getGPSDataById174)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取GPS水汽数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；id为数据存储中的已知序列；
                * @param getGPSDataById174
            
          */
        public void startgetGPSDataById(

            org.tempuri.GetGPSDataById getGPSDataById174,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气土壤水分类—水分总储存量，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiSoil03构建；arrStationNum为农气站站号数组，例如53392、53397；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Soil03_ShuiFenZongLiang176
                
         */

         
                     public org.tempuri.GetNongQi_Soil03_ShuiFenZongLiangResponse getNongQi_Soil03_ShuiFenZongLiang(

                        org.tempuri.GetNongQi_Soil03_ShuiFenZongLiang getNongQi_Soil03_ShuiFenZongLiang176)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气土壤水分类—水分总储存量，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiSoil03构建；arrStationNum为农气站站号数组，例如53392、53397；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Soil03_ShuiFenZongLiang176
            
          */
        public void startgetNongQi_Soil03_ShuiFenZongLiang(

            org.tempuri.GetNongQi_Soil03_ShuiFenZongLiang getNongQi_Soil03_ShuiFenZongLiang176,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 小气候分钟小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_XiaoQiHouHour构建；arrStationNum为小气候站站号数组，例如QH110、QH064；beginDate为开始时间,格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                    * @param getXiaoQiHou178
                
         */

         
                     public org.tempuri.GetXiaoQiHouResponse getXiaoQiHou(

                        org.tempuri.GetXiaoQiHou getXiaoQiHou178)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 小气候分钟小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_XiaoQiHouHour构建；arrStationNum为小气候站站号数组，例如QH110、QH064；beginDate为开始时间,格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                * @param getXiaoQiHou178
            
          */
        public void startgetXiaoQiHou(

            org.tempuri.GetXiaoQiHou getXiaoQiHou178,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取交通站（1代设备）路面观测数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_JiaoTongLuMian1Data构建；arrStationNum为交通站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                    * @param getJiaoTongLuMian1Data180
                
         */

         
                     public org.tempuri.GetJiaoTongLuMian1DataResponse getJiaoTongLuMian1Data(

                        org.tempuri.GetJiaoTongLuMian1Data getJiaoTongLuMian1Data180)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取交通站（1代设备）路面观测数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_JiaoTongLuMian1Data构建；arrStationNum为交通站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                * @param getJiaoTongLuMian1Data180
            
          */
        public void startgetJiaoTongLuMian1Data(

            org.tempuri.GetJiaoTongLuMian1Data getJiaoTongLuMian1Data180,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—Ecmwf预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；typeName为预报分类，设置850湿度风500高度、700湿度风、10m风2m湿度、逆温强度、混合层高度；observDate为预报日期，格式为yyyy-MM-dd
                    * @param getYuBao_EcmwfPicture182
                
         */

         
                     public org.tempuri.GetYuBao_EcmwfPictureResponse getYuBao_EcmwfPicture(

                        org.tempuri.GetYuBao_EcmwfPicture getYuBao_EcmwfPicture182)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—Ecmwf预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；typeName为预报分类，设置850湿度风500高度、700湿度风、10m风2m湿度、逆温强度、混合层高度；observDate为预报日期，格式为yyyy-MM-dd
                * @param getYuBao_EcmwfPicture182
            
          */
        public void startgetYuBao_EcmwfPicture(

            org.tempuri.GetYuBao_EcmwfPicture getYuBao_EcmwfPicture182,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 统计国家站积温，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间，格式为yyyy-MM-dd；endDate为结束时间，格式为yyyy-MM-dd；limitValue为限定值，例如求大于等于10℃积温，设置10
                    * @param getTongJi_AccumulatedTemperature184
                
         */

         
                     public org.tempuri.GetTongJi_AccumulatedTemperatureResponse getTongJi_AccumulatedTemperature(

                        org.tempuri.GetTongJi_AccumulatedTemperature getTongJi_AccumulatedTemperature184)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 统计国家站积温，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间，格式为yyyy-MM-dd；endDate为结束时间，格式为yyyy-MM-dd；limitValue为限定值，例如求大于等于10℃积温，设置10
                * @param getTongJi_AccumulatedTemperature184
            
          */
        public void startgetTongJi_AccumulatedTemperature(

            org.tempuri.GetTongJi_AccumulatedTemperature getTongJi_AccumulatedTemperature184,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气作物类—灌浆速度，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop03构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Crop03_GuanJiang186
                
         */

         
                     public org.tempuri.GetNongQi_Crop03_GuanJiangResponse getNongQi_Crop03_GuanJiang(

                        org.tempuri.GetNongQi_Crop03_GuanJiang getNongQi_Crop03_GuanJiang186)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气作物类—灌浆速度，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop03构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Crop03_GuanJiang186
            
          */
        public void startgetNongQi_Crop03_GuanJiang(

            org.tempuri.GetNongQi_Crop03_GuanJiang getNongQi_Crop03_GuanJiang186,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取水文站小时降水数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为国家站号数组，例如设置53698、54602等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getShuiWenRainHourDataByGuoJiaZhan188
                
         */

         
                     public org.tempuri.GetShuiWenRainHourDataByGuoJiaZhanResponse getShuiWenRainHourDataByGuoJiaZhan(

                        org.tempuri.GetShuiWenRainHourDataByGuoJiaZhan getShuiWenRainHourDataByGuoJiaZhan188)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取水文站小时降水数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为国家站号数组，例如设置53698、54602等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getShuiWenRainHourDataByGuoJiaZhan188
            
          */
        public void startgetShuiWenRainHourDataByGuoJiaZhan(

            org.tempuri.GetShuiWenRainHourDataByGuoJiaZhan getShuiWenRainHourDataByGuoJiaZhan188,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取水文站小时降水数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为水文站号数组，例如设置31054168等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getShuiWenRainHourData190
                
         */

         
                     public org.tempuri.GetShuiWenRainHourDataResponse getShuiWenRainHourData(

                        org.tempuri.GetShuiWenRainHourData getShuiWenRainHourData190)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取水文站小时降水数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为水文站号数组，例如设置31054168等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getShuiWenRainHourData190
            
          */
        public void startgetShuiWenRainHourData(

            org.tempuri.GetShuiWenRainHourData getShuiWenRainHourData190,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气牧草类—灌木、半灌木密度，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass05构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Grass05_MiDu192
                
         */

         
                     public org.tempuri.GetNongQi_Grass05_MiDuResponse getNongQi_Grass05_MiDu(

                        org.tempuri.GetNongQi_Grass05_MiDu getNongQi_Grass05_MiDu192)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气牧草类—灌木、半灌木密度，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass05构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Grass05_MiDu192
            
          */
        public void startgetNongQi_Grass05_MiDu(

            org.tempuri.GetNongQi_Grass05_MiDu getNongQi_Grass05_MiDu192,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取静止卫星文件列表，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间，格式yyyy-MM-dd HH:00
                    * @param getJingZhiWeiXingPicList194
                
         */

         
                     public org.tempuri.GetJingZhiWeiXingPicListResponse getJingZhiWeiXingPicList(

                        org.tempuri.GetJingZhiWeiXingPicList getJingZhiWeiXingPicList194)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取静止卫星文件列表，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间，格式yyyy-MM-dd HH:00
                * @param getJingZhiWeiXingPicList194
            
          */
        public void startgetJingZhiWeiXingPicList(

            org.tempuri.GetJingZhiWeiXingPicList getJingZhiWeiXingPicList194,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取水文站信息，参数：resultType为数据格式类型，设置xml或json
                    * @param getShuiWenZhanList196
                
         */

         
                     public org.tempuri.GetShuiWenZhanListResponse getShuiWenZhanList(

                        org.tempuri.GetShuiWenZhanList getShuiWenZhanList196)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取水文站信息，参数：resultType为数据格式类型，设置xml或json
                * @param getShuiWenZhanList196
            
          */
        public void startgetShuiWenZhanList(

            org.tempuri.GetShuiWenZhanList getShuiWenZhanList196,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取预警信号依据状态，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；type为预警信号状况，设置正在预警或非预警;arrStationNum为国家站号数组；beginDate为开始日期，格式为yyyy-MM-dd；endDate为结束日期，格式为yyyy-MM-dd
                    * @param getYuJingXinHaoDataByState198
                
         */

         
                     public org.tempuri.GetYuJingXinHaoDataByStateResponse getYuJingXinHaoDataByState(

                        org.tempuri.GetYuJingXinHaoDataByState getYuJingXinHaoDataByState198)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取预警信号依据状态，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；type为预警信号状况，设置正在预警或非预警;arrStationNum为国家站号数组；beginDate为开始日期，格式为yyyy-MM-dd；endDate为结束日期，格式为yyyy-MM-dd
                * @param getYuJingXinHaoDataByState198
            
          */
        public void startgetYuJingXinHaoDataByState(

            org.tempuri.GetYuJingXinHaoDataByState getYuJingXinHaoDataByState198,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取雷达回波拼图文件列表(最新20幅图像)，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json
                    * @param getLeiDaPinTuPicList200
                
         */

         
                     public org.tempuri.GetLeiDaPinTuPicListResponse getLeiDaPinTuPicList(

                        org.tempuri.GetLeiDaPinTuPicList getLeiDaPinTuPicList200)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取雷达回波拼图文件列表(最新20幅图像)，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json
                * @param getLeiDaPinTuPicList200
            
          */
        public void startgetLeiDaPinTuPicList(

            org.tempuri.GetLeiDaPinTuPicList getLeiDaPinTuPicList200,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—Ecmwf预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；typeName为预报分类，设置站点高空时序图、站点地面时序图、稳定指数；observDate为预报日期，格式为yyyy-MM-dd
                    * @param getYuBao_EcmwfStationPicture202
                
         */

         
                     public org.tempuri.GetYuBao_EcmwfStationPictureResponse getYuBao_EcmwfStationPicture(

                        org.tempuri.GetYuBao_EcmwfStationPicture getYuBao_EcmwfStationPicture202)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—Ecmwf预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；typeName为预报分类，设置站点高空时序图、站点地面时序图、稳定指数；observDate为预报日期，格式为yyyy-MM-dd
                * @param getYuBao_EcmwfStationPicture202
            
          */
        public void startgetYuBao_EcmwfStationPicture(

            org.tempuri.GetYuBao_EcmwfStationPicture getYuBao_EcmwfStationPicture202,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 复杂天气—暴雪，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组,利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getTongJi_BaoXue204
                
         */

         
                     public org.tempuri.GetTongJi_BaoXueResponse getTongJi_BaoXue(

                        org.tempuri.GetTongJi_BaoXue getTongJi_BaoXue204)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 复杂天气—暴雪，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组,利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getTongJi_BaoXue204
            
          */
        public void startgetTongJi_BaoXue(

            org.tempuri.GetTongJi_BaoXue getTongJi_BaoXue204,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取所有全国国家站信息，参数：resultType为数据格式类型，设置xml或json；
                    * @param getChinaAllGuoJiaZhan206
                
         */

         
                     public org.tempuri.GetChinaAllGuoJiaZhanResponse getChinaAllGuoJiaZhan(

                        org.tempuri.GetChinaAllGuoJiaZhan getChinaAllGuoJiaZhan206)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取所有全国国家站信息，参数：resultType为数据格式类型，设置xml或json；
                * @param getChinaAllGuoJiaZhan206
            
          */
        public void startgetChinaAllGuoJiaZhan(

            org.tempuri.GetChinaAllGuoJiaZhan getChinaAllGuoJiaZhan206,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取预报格点化数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为预报要素，利用QXDMS_Col_GeDianHuaFile构建；fileTime为预报文件时间，设置08或20；hour为预报未来小时数，设置03,06,09,12直到48之一；city为城市名，设置石家庄、保定、衡水之一
                    * @param getYuBao_GeDianHuaData208
                
         */

         
                     public org.tempuri.GetYuBao_GeDianHuaDataResponse getYuBao_GeDianHuaData(

                        org.tempuri.GetYuBao_GeDianHuaData getYuBao_GeDianHuaData208)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取预报格点化数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为预报要素，利用QXDMS_Col_GeDianHuaFile构建；fileTime为预报文件时间，设置08或20；hour为预报未来小时数，设置03,06,09,12直到48之一；city为城市名，设置石家庄、保定、衡水之一
                * @param getYuBao_GeDianHuaData208
            
          */
        public void startgetYuBao_GeDianHuaData(

            org.tempuri.GetYuBao_GeDianHuaData getYuBao_GeDianHuaData208,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取预警信号，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；id为数据存储中的已知序列；
                    * @param getYuJingXinHaoDataById210
                
         */

         
                     public org.tempuri.GetYuJingXinHaoDataByIdResponse getYuJingXinHaoDataById(

                        org.tempuri.GetYuJingXinHaoDataById getYuJingXinHaoDataById210)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取预警信号，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；id为数据存储中的已知序列；
                * @param getYuJingXinHaoDataById210
            
          */
        public void startgetYuJingXinHaoDataById(

            org.tempuri.GetYuJingXinHaoDataById getYuJingXinHaoDataById210,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—城镇预报-多时效，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果：json或者xml；arrColumnName为要素数组，利用QXDMS_Col_YuBaoChengZhen构建；arrStationNum为站号数组；shiCi为时次数组：12,24,36,48,60,72,84,96,108,120,132,144,156,168；observTime为起报日期时间：[日期+起报时次(08或者20,特别的市台有12)]yyyyMMddHH
                    * @param getYuBao_ChengZhenDuoShiXiaoYuBaoByTime212
                
         */

         
                     public org.tempuri.GetYuBao_ChengZhenDuoShiXiaoYuBaoByTimeResponse getYuBao_ChengZhenDuoShiXiaoYuBaoByTime(

                        org.tempuri.GetYuBao_ChengZhenDuoShiXiaoYuBaoByTime getYuBao_ChengZhenDuoShiXiaoYuBaoByTime212)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—城镇预报-多时效，参数：userName为用户名；password为密码；fileType为文件类型：中央台、省台、市台；resultType为返回结果：json或者xml；arrColumnName为要素数组，利用QXDMS_Col_YuBaoChengZhen构建；arrStationNum为站号数组；shiCi为时次数组：12,24,36,48,60,72,84,96,108,120,132,144,156,168；observTime为起报日期时间：[日期+起报时次(08或者20,特别的市台有12)]yyyyMMddHH
                * @param getYuBao_ChengZhenDuoShiXiaoYuBaoByTime212
            
          */
        public void startgetYuBao_ChengZhenDuoShiXiaoYuBaoByTime(

            org.tempuri.GetYuBao_ChengZhenDuoShiXiaoYuBaoByTime getYuBao_ChengZhenDuoShiXiaoYuBaoByTime212,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气土壤水分类—有效水分储存量，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiSoil04构建；arrStationNum为农气站站号数组，例如53392、53397；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Soil04_YouXiaoShuiFen214
                
         */

         
                     public org.tempuri.GetNongQi_Soil04_YouXiaoShuiFenResponse getNongQi_Soil04_YouXiaoShuiFen(

                        org.tempuri.GetNongQi_Soil04_YouXiaoShuiFen getNongQi_Soil04_YouXiaoShuiFen214)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气土壤水分类—有效水分储存量，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiSoil04构建；arrStationNum为农气站站号数组，例如53392、53397；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Soil04_YouXiaoShuiFen214
            
          */
        public void startgetNongQi_Soil04_YouXiaoShuiFen(

            org.tempuri.GetNongQi_Soil04_YouXiaoShuiFen getNongQi_Soil04_YouXiaoShuiFen214,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 复杂天气—寒潮，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置国家站或区域站；arrStationNum为查询站号数组，如果stationType为国家站,则arrStationNum利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getTongJi_HanChao216
                
         */

         
                     public org.tempuri.GetTongJi_HanChaoResponse getTongJi_HanChao(

                        org.tempuri.GetTongJi_HanChao getTongJi_HanChao216)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 复杂天气—寒潮，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置国家站或区域站；arrStationNum为查询站号数组，如果stationType为国家站,则arrStationNum利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getTongJi_HanChao216
            
          */
        public void startgetTongJi_HanChao(

            org.tempuri.GetTongJi_HanChao getTongJi_HanChao216,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气土壤水分类—土壤相对湿度，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiSoil02构建；arrStationNum为农气站站号数组，例如53392、53397；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Soil02_XiangDuiShiDu218
                
         */

         
                     public org.tempuri.GetNongQi_Soil02_XiangDuiShiDuResponse getNongQi_Soil02_XiangDuiShiDu(

                        org.tempuri.GetNongQi_Soil02_XiangDuiShiDu getNongQi_Soil02_XiangDuiShiDu218)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气土壤水分类—土壤相对湿度，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiSoil02构建；arrStationNum为农气站站号数组，例如53392、53397；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Soil02_XiangDuiShiDu218
            
          */
        public void startgetNongQi_Soil02_XiangDuiShiDu(

            org.tempuri.GetNongQi_Soil02_XiangDuiShiDu getNongQi_Soil02_XiangDuiShiDu218,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 统计历史上的今天，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组，国家站站号；month为月；day为日
                    * @param getHistoryToday220
                
         */

         
                     public org.tempuri.GetHistoryTodayResponse getHistoryToday(

                        org.tempuri.GetHistoryToday getHistoryToday220)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 统计历史上的今天，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组，国家站站号；month为月；day为日
                * @param getHistoryToday220
            
          */
        public void startgetHistoryToday(

            org.tempuri.GetHistoryToday getHistoryToday220,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 河北区域站小时报文数据查询，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素，利用QXDMS_Col_RegStation_DayData构建；arrStationNum为区域站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getHebQuYuZhanHourDataFromFile222
                
         */

         
                     public org.tempuri.GetHebQuYuZhanHourDataFromFileResponse getHebQuYuZhanHourDataFromFile(

                        org.tempuri.GetHebQuYuZhanHourDataFromFile getHebQuYuZhanHourDataFromFile222)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 河北区域站小时报文数据查询，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素，利用QXDMS_Col_RegStation_DayData构建；arrStationNum为区域站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getHebQuYuZhanHourDataFromFile222
            
          */
        public void startgetHebQuYuZhanHourDataFromFile(

            org.tempuri.GetHebQuYuZhanHourDataFromFile getHebQuYuZhanHourDataFromFile222,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气物候类—动植物物候期，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiPheno01构建；arrStationNum为农气站站号数组，例如53399、54405；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Pheno01_WuHou224
                
         */

         
                     public org.tempuri.GetNongQi_Pheno01_WuHouResponse getNongQi_Pheno01_WuHou(

                        org.tempuri.GetNongQi_Pheno01_WuHou getNongQi_Pheno01_WuHou224)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气物候类—动植物物候期，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiPheno01构建；arrStationNum为农气站站号数组，例如53399、54405；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Pheno01_WuHou224
            
          */
        public void startgetNongQi_Pheno01_WuHou(

            org.tempuri.GetNongQi_Pheno01_WuHou getNongQi_Pheno01_WuHou224,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站小时数据通过时次查询，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJianStation_HourData构建；arrStationNum为国家站站号数组，例如53698、54602；arrShiCi为观测时次数组，例如02、08、12；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getGuoJiaZhanHourByHourData226
                
         */

         
                     public org.tempuri.GetGuoJiaZhanHourByHourDataResponse getGuoJiaZhanHourByHourData(

                        org.tempuri.GetGuoJiaZhanHourByHourData getGuoJiaZhanHourByHourData226)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站小时数据通过时次查询，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJianStation_HourData构建；arrStationNum为国家站站号数组，例如53698、54602；arrShiCi为观测时次数组，例如02、08、12；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getGuoJiaZhanHourByHourData226
            
          */
        public void startgetGuoJiaZhanHourByHourData(

            org.tempuri.GetGuoJiaZhanHourByHourData getGuoJiaZhanHourByHourData226,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站天气现象小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为国家站号数组，如56398，54602等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；isCode为是否编码，0为非编码,1为编码
                    * @param getWeatherHourData228
                
         */

         
                     public org.tempuri.GetWeatherHourDataResponse getWeatherHourData(

                        org.tempuri.GetWeatherHourData getWeatherHourData228)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站天气现象小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为国家站号数组，如56398，54602等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；isCode为是否编码，0为非编码,1为编码
                * @param getWeatherHourData228
            
          */
        public void startgetWeatherHourData(

            org.tempuri.GetWeatherHourData getWeatherHourData228,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 复杂天气—大风，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组，利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getTongJi_DaFeng230
                
         */

         
                     public org.tempuri.GetTongJi_DaFengResponse getTongJi_DaFeng(

                        org.tempuri.GetTongJi_DaFeng getTongJi_DaFeng230)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 复杂天气—大风，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为查询站号数组，利用国家站站号构建；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getTongJi_DaFeng230
            
          */
        public void startgetTongJi_DaFeng(

            org.tempuri.GetTongJi_DaFeng getTongJi_DaFeng230,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取邻近省区域站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素，利用QXDMS_Col_RegStation_HourData构建；arrStationNum为区域站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getLinJinShengQuYuZhanHourDataByQuYuZhanNum232
                
         */

         
                     public org.tempuri.GetLinJinShengQuYuZhanHourDataByQuYuZhanNumResponse getLinJinShengQuYuZhanHourDataByQuYuZhanNum(

                        org.tempuri.GetLinJinShengQuYuZhanHourDataByQuYuZhanNum getLinJinShengQuYuZhanHourDataByQuYuZhanNum232)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取邻近省区域站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素，利用QXDMS_Col_RegStation_HourData构建；arrStationNum为区域站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getLinJinShengQuYuZhanHourDataByQuYuZhanNum232
            
          */
        public void startgetLinJinShengQuYuZhanHourDataByQuYuZhanNum(

            org.tempuri.GetLinJinShengQuYuZhanHourDataByQuYuZhanNum getLinJinShengQuYuZhanHourDataByQuYuZhanNum232,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—11地市大城市预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；arrStationNum，为11地市国家站号数组；observDate为预报发布日期；arrHour为预报时段，设置6、12、18、24
                    * @param getYuBao_11CityDaChengShiYuBao234
                
         */

         
                     public org.tempuri.GetYuBao_11CityDaChengShiYuBaoResponse getYuBao_11CityDaChengShiYuBao(

                        org.tempuri.GetYuBao_11CityDaChengShiYuBao getYuBao_11CityDaChengShiYuBao234)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—11地市大城市预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；arrStationNum，为11地市国家站号数组；observDate为预报发布日期；arrHour为预报时段，设置6、12、18、24
                * @param getYuBao_11CityDaChengShiYuBao234
            
          */
        public void startgetYuBao_11CityDaChengShiYuBao(

            org.tempuri.GetYuBao_11CityDaChengShiYuBao getYuBao_11CityDaChengShiYuBao234,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气作物类—产量结构，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop05构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Crop05_ChangLiangJieGou236
                
         */

         
                     public org.tempuri.GetNongQi_Crop05_ChangLiangJieGouResponse getNongQi_Crop05_ChangLiangJieGou(

                        org.tempuri.GetNongQi_Crop05_ChangLiangJieGou getNongQi_Crop05_ChangLiangJieGou236)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气作物类—产量结构，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop05构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Crop05_ChangLiangJieGou236
            
          */
        public void startgetNongQi_Crop05_ChangLiangJieGou(

            org.tempuri.GetNongQi_Crop05_ChangLiangJieGou getNongQi_Crop05_ChangLiangJieGou236,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取无地图叠加的雷达回波拼图文件列表(最新20幅图像)，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json
                    * @param getLeiDaPinTuPicList_NoMap238
                
         */

         
                     public org.tempuri.GetLeiDaPinTuPicList_NoMapResponse getLeiDaPinTuPicList_NoMap(

                        org.tempuri.GetLeiDaPinTuPicList_NoMap getLeiDaPinTuPicList_NoMap238)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取无地图叠加的雷达回波拼图文件列表(最新20幅图像)，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json
                * @param getLeiDaPinTuPicList_NoMap238
            
          */
        public void startgetLeiDaPinTuPicList_NoMap(

            org.tempuri.GetLeiDaPinTuPicList_NoMap getLeiDaPinTuPicList_NoMap238,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取高空秒级数据文件，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为高空站号数组；arrShiCi是时次数组，传递08、20；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getGaoKongSecondDataFile240
                
         */

         
                     public org.tempuri.GetGaoKongSecondDataFileResponse getGaoKongSecondDataFile(

                        org.tempuri.GetGaoKongSecondDataFile getGaoKongSecondDataFile240)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取高空秒级数据文件，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为高空站号数组；arrShiCi是时次数组，传递08、20；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getGaoKongSecondDataFile240
            
          */
        public void startgetGaoKongSecondDataFile(

            org.tempuri.GetGaoKongSecondDataFile getGaoKongSecondDataFile240,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取土壤水分站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_TuRangShuiFenStation_HourData构建；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getTuRangShuiFenZhanHourDataByGuoJiaZhan242
                
         */

         
                     public org.tempuri.GetTuRangShuiFenZhanHourDataByGuoJiaZhanResponse getTuRangShuiFenZhanHourDataByGuoJiaZhan(

                        org.tempuri.GetTuRangShuiFenZhanHourDataByGuoJiaZhan getTuRangShuiFenZhanHourDataByGuoJiaZhan242)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取土壤水分站小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_TuRangShuiFenStation_HourData构建；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getTuRangShuiFenZhanHourDataByGuoJiaZhan242
            
          */
        public void startgetTuRangShuiFenZhanHourDataByGuoJiaZhan(

            org.tempuri.GetTuRangShuiFenZhanHourDataByGuoJiaZhan getTuRangShuiFenZhanHourDataByGuoJiaZhan242,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—沿海区域指导预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml
                    * @param getYuBao_YanHaiYuBao244
                
         */

         
                     public org.tempuri.GetYuBao_YanHaiYuBaoResponse getYuBao_YanHaiYuBao(

                        org.tempuri.GetYuBao_YanHaiYuBao getYuBao_YanHaiYuBao244)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—沿海区域指导预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml
                * @param getYuBao_YanHaiYuBao244
            
          */
        public void startgetYuBao_YanHaiYuBao(

            org.tempuri.GetYuBao_YanHaiYuBao getYuBao_YanHaiYuBao244,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取交通站（2代设备）路面观测数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_JiaoTongLuMian2Data构建；arrStationNum为交通站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                    * @param getJiaoTongLuMian2Data246
                
         */

         
                     public org.tempuri.GetJiaoTongLuMian2DataResponse getJiaoTongLuMian2Data(

                        org.tempuri.GetJiaoTongLuMian2Data getJiaoTongLuMian2Data246)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取交通站（2代设备）路面观测数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_JiaoTongLuMian2Data构建；arrStationNum为交通站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                * @param getJiaoTongLuMian2Data246
            
          */
        public void startgetJiaoTongLuMian2Data(

            org.tempuri.GetJiaoTongLuMian2Data getJiaoTongLuMian2Data246,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取1981至2010整编日数据，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始日期，与年份无关，可任意指定年份；endDate为结束日期，与年份无关，可任意指定年份；
                    * @param get1981_2010HistroyDayData248
                
         */

         
                     public org.tempuri.Get1981_2010HistroyDayDataResponse get1981_2010HistroyDayData(

                        org.tempuri.Get1981_2010HistroyDayData get1981_2010HistroyDayData248)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取1981至2010整编日数据，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，设置53698、54602等；beginDate为开始日期，与年份无关，可任意指定年份；endDate为结束日期，与年份无关，可任意指定年份；
                * @param get1981_2010HistroyDayData248
            
          */
        public void startget1981_2010HistroyDayData(

            org.tempuri.Get1981_2010HistroyDayData get1981_2010HistroyDayData248,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气土壤水分类—土壤冻结与解冻，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiSoil05构建；arrStationNum为农气站站号数组，例如53392、53397；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Soil05_HuaDong250
                
         */

         
                     public org.tempuri.GetNongQi_Soil05_HuaDongResponse getNongQi_Soil05_HuaDong(

                        org.tempuri.GetNongQi_Soil05_HuaDong getNongQi_Soil05_HuaDong250)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气土壤水分类—土壤冻结与解冻，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiSoil05构建；arrStationNum为农气站站号数组，例如53392、53397；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Soil05_HuaDong250
            
          */
        public void startgetNongQi_Soil05_HuaDong(

            org.tempuri.GetNongQi_Soil05_HuaDong getNongQi_Soil05_HuaDong250,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取邻近省区域站5分钟加密数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素，利用QXDMS_Col_RegStation_MinuteData构建；arrStationNum为区域站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                    * @param getLinJinShengQuYuZhanMinuteDataByQuYuZhanNum252
                
         */

         
                     public org.tempuri.GetLinJinShengQuYuZhanMinuteDataByQuYuZhanNumResponse getLinJinShengQuYuZhanMinuteDataByQuYuZhanNum(

                        org.tempuri.GetLinJinShengQuYuZhanMinuteDataByQuYuZhanNum getLinJinShengQuYuZhanMinuteDataByQuYuZhanNum252)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取邻近省区域站5分钟加密数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素，利用QXDMS_Col_RegStation_MinuteData构建；arrStationNum为区域站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                * @param getLinJinShengQuYuZhanMinuteDataByQuYuZhanNum252
            
          */
        public void startgetLinJinShengQuYuZhanMinuteDataByQuYuZhanNum(

            org.tempuri.GetLinJinShengQuYuZhanMinuteDataByQuYuZhanNum getLinJinShengQuYuZhanMinuteDataByQuYuZhanNum252,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—降水落区预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml;
                    * @param getYuBao_RainFallPic254
                
         */

         
                     public org.tempuri.GetYuBao_RainFallPicResponse getYuBao_RainFallPic(

                        org.tempuri.GetYuBao_RainFallPic getYuBao_RainFallPic254)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—降水落区预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml;
                * @param getYuBao_RainFallPic254
            
          */
        public void startgetYuBao_RainFallPic(

            org.tempuri.GetYuBao_RainFallPic getYuBao_RainFallPic254,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取环境气象小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_HuanJingStation_HourData构建；arrStationNum为环境站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                    * @param getHuanJingZhanHourData256
                
         */

         
                     public org.tempuri.GetHuanJingZhanHourDataResponse getHuanJingZhanHourData(

                        org.tempuri.GetHuanJingZhanHourData getHuanJingZhanHourData256)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取环境气象小时数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_HuanJingStation_HourData构建；arrStationNum为环境站站号数组；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；
                * @param getHuanJingZhanHourData256
            
          */
        public void startgetHuanJingZhanHourData(

            org.tempuri.GetHuanJingZhanHourData getHuanJingZhanHourData256,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取全国闪电定位数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_ShanDianDingWeiData构建；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getShanDianDingWeiDataChina258
                
         */

         
                     public org.tempuri.GetShanDianDingWeiDataChinaResponse getShanDianDingWeiDataChina(

                        org.tempuri.GetShanDianDingWeiDataChina getShanDianDingWeiDataChina258)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取全国闪电定位数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_ShanDianDingWeiData构建；beginDate为开始时间，格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getShanDianDingWeiDataChina258
            
          */
        public void startgetShanDianDingWeiDataChina(

            org.tempuri.GetShanDianDingWeiDataChina getShanDianDingWeiDataChina258,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 统计指定时次的土壤水分数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；hour为指定观测时次，例如08、14、20；arrColumnName为查询要素数组，利用QXDMS_Col_TuRangShuiFenStation_HourData构建；arrSqlFunction为聚合函数数组，例如Avg、Sum、Max、Min；arrStationNum为查询站号数组，设置土壤水分站号53593、53399等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间，格式yyyy-MM-dd HH:00；
                    * @param getTongJiTuRangShuiFen260
                
         */

         
                     public org.tempuri.GetTongJiTuRangShuiFenResponse getTongJiTuRangShuiFen(

                        org.tempuri.GetTongJiTuRangShuiFen getTongJiTuRangShuiFen260)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 统计指定时次的土壤水分数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；hour为指定观测时次，例如08、14、20；arrColumnName为查询要素数组，利用QXDMS_Col_TuRangShuiFenStation_HourData构建；arrSqlFunction为聚合函数数组，例如Avg、Sum、Max、Min；arrStationNum为查询站号数组，设置土壤水分站号53593、53399等；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间，格式yyyy-MM-dd HH:00；
                * @param getTongJiTuRangShuiFen260
            
          */
        public void startgetTongJiTuRangShuiFen(

            org.tempuri.GetTongJiTuRangShuiFen getTongJiTuRangShuiFen260,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—乡镇预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；arrColumnName为要素数组，利用QXDMS_Col_YuBaoChengZhen构建；arrStationNum为站号数组，设置国家站、区域站站号；shiCi为时次数组：3,6,9,12等每隔3小时一个时次；observTime为起报日期时间：[日期+起报时次(08或者20)]yyyyMMddHH
                    * @param getYuBao_XiangZhenYuBao262
                
         */

         
                     public org.tempuri.GetYuBao_XiangZhenYuBaoResponse getYuBao_XiangZhenYuBao(

                        org.tempuri.GetYuBao_XiangZhenYuBao getYuBao_XiangZhenYuBao262)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—乡镇预报，参数：userName为用户名；password为密码；resultType为返回结果：json或者xml；arrColumnName为要素数组，利用QXDMS_Col_YuBaoChengZhen构建；arrStationNum为站号数组，设置国家站、区域站站号；shiCi为时次数组：3,6,9,12等每隔3小时一个时次；observTime为起报日期时间：[日期+起报时次(08或者20)]yyyyMMddHH
                * @param getYuBao_XiangZhenYuBao262
            
          */
        public void startgetYuBao_XiangZhenYuBao(

            org.tempuri.GetYuBao_XiangZhenYuBao getYuBao_XiangZhenYuBao262,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取全国国家站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，设置53698等；
                    * @param getChinaGuoJiaZhanListByStationNum264
                
         */

         
                     public org.tempuri.GetChinaGuoJiaZhanListByStationNumResponse getChinaGuoJiaZhanListByStationNum(

                        org.tempuri.GetChinaGuoJiaZhanListByStationNum getChinaGuoJiaZhanListByStationNum264)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取全国国家站信息，参数：resultType为数据格式类型，设置xml或json；arrStationNum为国家站站号数组，设置53698等；
                * @param getChinaGuoJiaZhanListByStationNum264
            
          */
        public void startgetChinaGuoJiaZhanListByStationNum(

            org.tempuri.GetChinaGuoJiaZhanListByStationNum getChinaGuoJiaZhanListByStationNum264,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取国家站5分钟加密数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_MinuteData构建；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间,格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                    * @param getGuoJiaZhanMinuteData266
                
         */

         
                     public org.tempuri.GetGuoJiaZhanMinuteDataResponse getGuoJiaZhanMinuteData(

                        org.tempuri.GetGuoJiaZhanMinuteData getGuoJiaZhanMinuteData266)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取国家站5分钟加密数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_GuoJiaStation_MinuteData构建；arrStationNum为国家站站号数组，例如53698、54602；beginDate为开始时间,格式yyyy-MM-dd HH:mm；endDate为结束时间,格式yyyy-MM-dd HH:mm；
                * @param getGuoJiaZhanMinuteData266
            
          */
        public void startgetGuoJiaZhanMinuteData(

            org.tempuri.GetGuoJiaZhanMinuteData getGuoJiaZhanMinuteData266,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取服务产品地址，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrProductType为产品类别数组，利用QXDMS_Col_FuWuProduct构建；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；area：发布地区，例如：省服务中心、石家庄等；areaType为分类：省、市、县；
                    * @param getFuWuProduct268
                
         */

         
                     public org.tempuri.GetFuWuProductResponse getFuWuProduct(

                        org.tempuri.GetFuWuProduct getFuWuProduct268)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取服务产品地址，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrProductType为产品类别数组，利用QXDMS_Col_FuWuProduct构建；beginDate为开始时间，格式yyyy-MM-dd HH:00；endDate为结束时间,格式yyyy-MM-dd HH:00；area：发布地区，例如：省服务中心、石家庄等；areaType为分类：省、市、县；
                * @param getFuWuProduct268
            
          */
        public void startgetFuWuProduct(

            org.tempuri.GetFuWuProduct getFuWuProduct268,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气作物类—关键农事活动，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop06构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Crop06_NongShiHuoDong270
                
         */

         
                     public org.tempuri.GetNongQi_Crop06_NongShiHuoDongResponse getNongQi_Crop06_NongShiHuoDong(

                        org.tempuri.GetNongQi_Crop06_NongShiHuoDong getNongQi_Crop06_NongShiHuoDong270)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气作物类—关键农事活动，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop06构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Crop06_NongShiHuoDong270
            
          */
        public void startgetNongQi_Crop06_NongShiHuoDong(

            org.tempuri.GetNongQi_Crop06_NongShiHuoDong getNongQi_Crop06_NongShiHuoDong270,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气作物类—干物质与叶面积，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop02构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Crop02_GanWuZhi272
                
         */

         
                     public org.tempuri.GetNongQi_Crop02_GanWuZhiResponse getNongQi_Crop02_GanWuZhi(

                        org.tempuri.GetNongQi_Crop02_GanWuZhi getNongQi_Crop02_GanWuZhi272)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气作物类—干物质与叶面积，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop02构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Crop02_GanWuZhi272
            
          */
        public void startgetNongQi_Crop02_GanWuZhi(

            org.tempuri.GetNongQi_Crop02_GanWuZhi getNongQi_Crop02_GanWuZhi272,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气作物类—县产量水平，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop07构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Crop07_ChangLiangShuiPing274
                
         */

         
                     public org.tempuri.GetNongQi_Crop07_ChangLiangShuiPingResponse getNongQi_Crop07_ChangLiangShuiPing(

                        org.tempuri.GetNongQi_Crop07_ChangLiangShuiPing getNongQi_Crop07_ChangLiangShuiPing274)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气作物类—县产量水平，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop07构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Crop07_ChangLiangShuiPing274
            
          */
        public void startgetNongQi_Crop07_ChangLiangShuiPing(

            org.tempuri.GetNongQi_Crop07_ChangLiangShuiPing getNongQi_Crop07_ChangLiangShuiPing274,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取台站元数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置为区域站；changeType为变动类型，设置新建、撤销、变更；
                    * @param getStationInfo276
                
         */

         
                     public org.tempuri.GetStationInfoResponse getStationInfo(

                        org.tempuri.GetStationInfo getStationInfo276)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取台站元数据，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；stationType为站点类型，设置为区域站；changeType为变动类型，设置新建、撤销、变更；
                * @param getStationInfo276
            
          */
        public void startgetStationInfo(

            org.tempuri.GetStationInfo getStationInfo276,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气作物类—产量因素，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop04构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Crop04_ChanLiang278
                
         */

         
                     public org.tempuri.GetNongQi_Crop04_ChanLiangResponse getNongQi_Crop04_ChanLiang(

                        org.tempuri.GetNongQi_Crop04_ChanLiang getNongQi_Crop04_ChanLiang278)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气作物类—产量因素，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiCrop04构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Crop04_ChanLiang278
            
          */
        public void startgetNongQi_Crop04_ChanLiang(

            org.tempuri.GetNongQi_Crop04_ChanLiang getNongQi_Crop04_ChanLiang278,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取格点化预报文件，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrElement为要素类型数组，利用QXDMS_Col_GeDianHuaFile构建；arrShiCi为时次数组，目前包括08和20；arrYuBaoShiDuan为预报时段数组，例如3，6，9等；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                    * @param getGeDianHuaDataFile280
                
         */

         
                     public org.tempuri.GetGeDianHuaDataFileResponse getGeDianHuaDataFile(

                        org.tempuri.GetGeDianHuaDataFile getGeDianHuaDataFile280)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取格点化预报文件，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrElement为要素类型数组，利用QXDMS_Col_GeDianHuaFile构建；arrShiCi为时次数组，目前包括08和20；arrYuBaoShiDuan为预报时段数组，例如3，6，9等；beginDate为开始时间，据格式为yyyy-MM-dd；endDate为结束时，格式为yyyy-MM-dd；
                * @param getGeDianHuaDataFile280
            
          */
        public void startgetGeDianHuaDataFile(

            org.tempuri.GetGeDianHuaDataFile getGeDianHuaDataFile280,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取指定条件下区域站日数据的日数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为要素，利用QXDMS_Col_RegStation_DayData构建；arrStationNum为站号数组；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd；minValue：(double)指定条件最小值；maxValue：(double)指定条件最大值
                    * @param getTongJi_QuYuZhanLimitValueDayCount282
                
         */

         
                     public org.tempuri.GetTongJi_QuYuZhanLimitValueDayCountResponse getTongJi_QuYuZhanLimitValueDayCount(

                        org.tempuri.GetTongJi_QuYuZhanLimitValueDayCount getTongJi_QuYuZhanLimitValueDayCount282)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取指定条件下区域站日数据的日数，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；element为要素，利用QXDMS_Col_RegStation_DayData构建；arrStationNum为站号数组；beginDate为开始时间，日数据格式为yyyy-MM-dd；endDate为结束时间,日数据格式为yyyy-MM-dd；minValue：(double)指定条件最小值；maxValue：(double)指定条件最大值
                * @param getTongJi_QuYuZhanLimitValueDayCount282
            
          */
        public void startgetTongJi_QuYuZhanLimitValueDayCount(

            org.tempuri.GetTongJi_QuYuZhanLimitValueDayCount getTongJi_QuYuZhanLimitValueDayCount282,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取预警信号，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为站号数组；beginDate为开始时间，格式如yyyy-MM-dd HH:mm；endDate为结束时间，格式如yyyy-MM-dd HH:mm；
                    * @param getYuJingXinHaoData284
                
         */

         
                     public org.tempuri.GetYuJingXinHaoDataResponse getYuJingXinHaoData(

                        org.tempuri.GetYuJingXinHaoData getYuJingXinHaoData284)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取预警信号，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrStationNum为站号数组；beginDate为开始时间，格式如yyyy-MM-dd HH:mm；endDate为结束时间，格式如yyyy-MM-dd HH:mm；
                * @param getYuJingXinHaoData284
            
          */
        public void startgetYuJingXinHaoData(

            org.tempuri.GetYuJingXinHaoData getYuJingXinHaoData284,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取气象科普，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；beginDate为开始时间，格式如yyyy-MM-dd；endDate为结束时间，格式如yyyy-MM-dd；
                    * @param getQiXiangKePu286
                
         */

         
                     public org.tempuri.GetQiXiangKePuResponse getQiXiangKePu(

                        org.tempuri.GetQiXiangKePu getQiXiangKePu286)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取气象科普，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；beginDate为开始时间，格式如yyyy-MM-dd；endDate为结束时间，格式如yyyy-MM-dd；
                * @param getQiXiangKePu286
            
          */
        public void startgetQiXiangKePu(

            org.tempuri.GetQiXiangKePu getQiXiangKePu286,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取葵花8卫星文件列表，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间，格式yyyy-MM-dd HH:mm
                    * @param getHS8PicList288
                
         */

         
                     public org.tempuri.GetHS8PicListResponse getHS8PicList(

                        org.tempuri.GetHS8PicList getHS8PicList288)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取葵花8卫星文件列表，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；beginDate为开始时间，格式yyyy-MM-dd HH:mm；endDate为结束时间，格式yyyy-MM-dd HH:mm
                * @param getHS8PicList288
            
          */
        public void startgetHS8PicList(

            org.tempuri.GetHS8PicList getHS8PicList288,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 获取交通站信息，参数：resultType为数据格式类型，设置xml或json；arrGaoSuName为高速名称数组，设置京沪高速、石安高速等；
                    * @param getJiaoTongZhanListByArea290
                
         */

         
                     public org.tempuri.GetJiaoTongZhanListByAreaResponse getJiaoTongZhanListByArea(

                        org.tempuri.GetJiaoTongZhanListByArea getJiaoTongZhanListByArea290)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 获取交通站信息，参数：resultType为数据格式类型，设置xml或json；arrGaoSuName为高速名称数组，设置京沪高速、石安高速等；
                * @param getJiaoTongZhanListByArea290
            
          */
        public void startgetJiaoTongZhanListByArea(

            org.tempuri.GetJiaoTongZhanListByArea getJiaoTongZhanListByArea290,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气基本气象要素—旬气象要素，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiMete01构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Mete01_Xun292
                
         */

         
                     public org.tempuri.GetNongQi_Mete01_XunResponse getNongQi_Mete01_Xun(

                        org.tempuri.GetNongQi_Mete01_Xun getNongQi_Mete01_Xun292)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气基本气象要素—旬气象要素，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiMete01构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Mete01_Xun292
            
          */
        public void startgetNongQi_Mete01_Xun(

            org.tempuri.GetNongQi_Mete01_Xun getNongQi_Mete01_Xun292,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 农气牧草类—牧草发育期，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass01构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                    * @param getNongQi_Grass01_FaYuQi294
                
         */

         
                     public org.tempuri.GetNongQi_Grass01_FaYuQiResponse getNongQi_Grass01_FaYuQi(

                        org.tempuri.GetNongQi_Grass01_FaYuQi getNongQi_Grass01_FaYuQi294)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 农气牧草类—牧草发育期，参数：userName为用户名；password为密码；resultType为数据格式类型，设置xml或json；arrColumnName为查询要素数组，利用QXDMS_Col_NongQiGrass01构建；arrStationNum为农气站站号数组，例如53789、53697；beginDate为开始时间,格式yyyy-MM-dd；endDate为结束时间,格式yyyy-MM-dd；
                * @param getNongQi_Grass01_FaYuQi294
            
          */
        public void startgetNongQi_Grass01_FaYuQi(

            org.tempuri.GetNongQi_Grass01_FaYuQi getNongQi_Grass01_FaYuQi294,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 预报类—短时预报，参数：userName为用户名；password为密码；
                    * @param getYuBao_DuanShiYuBao296
                
         */

         
                     public org.tempuri.GetYuBao_DuanShiYuBaoResponse getYuBao_DuanShiYuBao(

                        org.tempuri.GetYuBao_DuanShiYuBao getYuBao_DuanShiYuBao296)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 预报类—短时预报，参数：userName为用户名；password为密码；
                * @param getYuBao_DuanShiYuBao296
            
          */
        public void startgetYuBao_DuanShiYuBao(

            org.tempuri.GetYuBao_DuanShiYuBao getYuBao_DuanShiYuBao296,

            final org.tempuri.ShuJuHuanJingCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    