package org.swinglife.common;

/**
 * Created by lxd on 2014/11/27.
 */
public interface Global {

    public static final String ERRORS_DEFINED = "message";

    /** 所有用于根节点的树都使用此值*/
    public static String TREE_NODE_ROOT_ID = "00000000000000000000000000000001";

    public static String UPLOAD_DIR = "upload";

    public static String PAY_INTERFACE="00000000000000000000000000000001";

    public static String FRONT_END_USER="frontEndUser";

    //默认出发城市名称
    public static String DEPT_CITY_NAME="广州";

    //酒店星级
    public static String HOTEL_LEVEL = "HOTEL_LEVEL";

    //床型
    public static String BED_TYPE = "BED_TYPE";
    //出发地cookie key
    public static String DEPT_CITY_COOKIE_KEY="deptCityKey";

    //渠道类型session key
    public static String CHANEL_TYPE_KEY="chanelTypeKey";

    //渠道所属公司ID session key
    public static String CHANEL_COMPANY_ID_KEY="chanelCompanyId";

    //系统参数产品图片规格key
    public static String PRODUCT_IMAGE_SPEC="PRODUCT_IMAGE_SPEC";

    //系统参数敏感关键词key
    public static String SENSITIVE_KEYWORDS="SENSITIVE_KEYWORDS";
    //评论类型前缀
    public static String COMMENT_PRE="COMMENT_TYPE_";

    //签证身份类型
    public static String IDENTITY_TYPE="IDENTITY_TYPE";
    //签证类型
    public static String VISA_TYPE="VISA_TYPE";

    //国外酒店与中国酒店标识
    public static String CHINA_COUNTRY="中国";

    //组团产品最小价格
    public static Long MIN_PRICE= new Long(0);

    //组团产品最大价格
    public static Long MAX_PRICE= new Long(999999999);

    //行程天数9天以上
    public static Integer NINE_TRAVEL_DAYS = 9;

    //订单评论的评论状态
    public static String ORDER_COMMENT_IS_COMMENTED="1";
    //评论审核的默认状态
    public static String COMMENT_DEFAULT_STATUS="0";


    //checkBox 选中为on
    public static String SELECT_CHECKBOX = "on";
    //目的地管理层级最多4级
    public static Integer DESTINATION_STEP = 4;

    //验证码
    public static final String VALIDATE_CODE = "ValidateCode";

    //登陆帐号
    public static final String  LOGIN_ACCOUNT="loginAccount";

    //攻略图片规格
    public static final String STRATEGY_IMG_SPEC = "229x315,128x180,150x180,220x350";

    public static  String TRAVEL_NOTE_PLAY_TAG="B2C_TRAVEL_NOTE_PLAY_TAG";

    //游记标签
    public static String TRAVEL_NOTE_TAG = "B2C_TRAVEL_NOTE_TAG";

    //邮轮资源类型
    public static String RES_TYPE_YL = "YL";
    //机票资源类型
    public static String RES_TYPE_JP = "JP";
    //邮轮预定数据,key值
    public static String CRUISE_ORDER_KEY= "curiseOrder";
    //票卷资源类型
    public static String RES_TYPE_PQ = "PQ";

    //签证资源类型
    public static String RES_TYPE_QZ = "QZ";

    //下单时保存在session的组团信息
    public static String GROUP_TOUR_ORDER_MSG = "groupTourOrderMsg";
    //下单时保存在session的酒店房间信息
    public static String HOTEL_ORDER_MSG = "hotelOrderMsg";
    //下单时保存在session的自由行产品信息
    public static String FREE_TRAVEL_ORDER_MSG = "freeTravelOrderMsg";
    //游轮舱房有效的状态
    public static String CRUISE_ROOM_ENABLE_STATUS = "AVL";
    //游轮图片主图
    public static String CRUISE_IMAGE_PRIMARY = "1";
    //身份类型
    public static String CERT_TYPE="CERT_TYPE";

    public static final String ERRORS_PAYMENT_DETAIL = "errors.payment.detail";

    public static final String TICKET_ORDER = "ticketOrder";

    //CRM会员类型
    public static final String CRM_USER_TYPE ="个人客户";

    public static String AGENT_FRONT_END_USER="agentFrontEndUser";

    //下单时保存在session的签证信息信息
    public static String VISA_ORDER = "visaOrder";

    //下单时保存在session的机票信息信息
    public static String AIRPLANE_ORDER = "airPlaneOrder";

    //登录后返回到上次请求的URL
    public static String GO_TO_URL="goToUrl";

    public static String Not_GO_TO_URL="account/forgotPassword.html,account/register.html";

    //同业组织下单用户关系数据字典TYPECODE
    public static String B2C_PARENTERORG_ORDERUSER = "B2C_PARENTERORG_ORDERUSER";

    //最小积分
    public static Integer MIN_POINT= 0;

    //最大积分
    public static Integer MAX_POINT= Integer.MAX_VALUE;

    //订单提交固定入参
    public static String SALE_COMPANY_ID = "SALE_COMPANY_ID";
    public static String SALE_COMPANY_NAME = "SALE_COMPANY_NAME";
    public static String SALE_STORE_ID = "SALE_STORE_ID";
    public static String SALE_STORE_NAME = "SALE_STORE_NAME";
    public static String SALER_ID = "SALER_ID";
    public static String SALER_NAME = "SALER_NAME";

    //积分兑换礼品订单信息
    public static String GIFT_ORDER_MSG = "giftOrderMsg";
}
