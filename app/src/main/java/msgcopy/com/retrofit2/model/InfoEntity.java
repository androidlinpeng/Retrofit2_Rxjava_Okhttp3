package msgcopy.com.retrofit2.model;

import java.util.List;

/**
 * Created by liang on 2017/4/12.
 */

public class InfoEntity {


    /**
     * splash : {"url":"http://cloud9.kaoke.me/smedia/app/sda1/appresource/a36dca37de07d03309c48851dab8d217/2017/03/9_6.jpg"}
     * ico : http://cloud9.kaoke.me/smedia/app/sda1/appresource/a36dca37de07d03309c48851dab8d217/2016/12/diy_appico_110925.png
     * descr :
     * apptype : {"id":8,"title":"娱乐"}
     * title : 丸子屋
     * m_url : http://cloud6.kaoke.me/?channel_id=A1G1Z00140CjcA002A001A001A0010000T/
     * titleico : {"url":"http://cloud9.kaoke.me/smedia/app/sda1/appresource/a36dca37de07d03309c48851dab8d217/2016/12/diy_titleico_111033.png"}
     * qrcode_test : {"url":"http://cloud7.kaoke.me/qr/10516/test/","qr_url":"http://cloud9.kaoke.me/smedia/app/sda1/appico/sys/qr_test_10516_1.png"}
     * shop_id : 505
     * master : Tcoll
     * qrcode : {"url":"http://cloud7.kaoke.me/qr/10516/","qr_url":"http://cloud9.kaoke.me/smedia/app/sda1/appico/sys/qr_10516_1.png"}
     * guides : [{"url":"http://cloud9.kaoke.me/smedia/app/sda1/appresource/a36dca37de07d03309c48851dab8d217/2017/03/3_2_3.gif","id":29,"idx":0},{"url":"http://cloud9.kaoke.me/smedia/app/sda1/appresource/a36dca37de07d03309c48851dab8d217/2017/03/1_2.gif","id":30,"idx":1}]
     */

    private SplashBean splash;
    private String ico;
    private String descr;
    private ApptypeBean apptype;
    private String title;
    private String m_url;
    private TitleicoBean titleico;
    private QrcodeTestBean qrcode_test;
    private int shop_id;
    private String master;
    private QrcodeBean qrcode;
    private List<GuidesBean> guides;

    public SplashBean getSplash() {
        return splash;
    }

    public void setSplash(SplashBean splash) {
        this.splash = splash;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public ApptypeBean getApptype() {
        return apptype;
    }

    public void setApptype(ApptypeBean apptype) {
        this.apptype = apptype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getM_url() {
        return m_url;
    }

    public void setM_url(String m_url) {
        this.m_url = m_url;
    }

    public TitleicoBean getTitleico() {
        return titleico;
    }

    public void setTitleico(TitleicoBean titleico) {
        this.titleico = titleico;
    }

    public QrcodeTestBean getQrcode_test() {
        return qrcode_test;
    }

    public void setQrcode_test(QrcodeTestBean qrcode_test) {
        this.qrcode_test = qrcode_test;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public QrcodeBean getQrcode() {
        return qrcode;
    }

    public void setQrcode(QrcodeBean qrcode) {
        this.qrcode = qrcode;
    }

    public List<GuidesBean> getGuides() {
        return guides;
    }

    public void setGuides(List<GuidesBean> guides) {
        this.guides = guides;
    }

    public static class SplashBean {
        /**
         * url : http://cloud9.kaoke.me/smedia/app/sda1/appresource/a36dca37de07d03309c48851dab8d217/2017/03/9_6.jpg
         */

        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class ApptypeBean {
        /**
         * id : 8
         * title : 娱乐
         */

        private int id;
        private String title;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class TitleicoBean {
        /**
         * url : http://cloud9.kaoke.me/smedia/app/sda1/appresource/a36dca37de07d03309c48851dab8d217/2016/12/diy_titleico_111033.png
         */

        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class QrcodeTestBean {
        /**
         * url : http://cloud7.kaoke.me/qr/10516/test/
         * qr_url : http://cloud9.kaoke.me/smedia/app/sda1/appico/sys/qr_test_10516_1.png
         */

        private String url;
        private String qr_url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getQr_url() {
            return qr_url;
        }

        public void setQr_url(String qr_url) {
            this.qr_url = qr_url;
        }
    }

    public static class QrcodeBean {
        /**
         * url : http://cloud7.kaoke.me/qr/10516/
         * qr_url : http://cloud9.kaoke.me/smedia/app/sda1/appico/sys/qr_10516_1.png
         */

        private String url;
        private String qr_url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getQr_url() {
            return qr_url;
        }

        public void setQr_url(String qr_url) {
            this.qr_url = qr_url;
        }
    }

    public static class GuidesBean {
        /**
         * url : http://cloud9.kaoke.me/smedia/app/sda1/appresource/a36dca37de07d03309c48851dab8d217/2017/03/3_2_3.gif
         * id : 29
         * idx : 0
         */

        private String url;
        private int id;
        private int idx;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIdx() {
            return idx;
        }

        public void setIdx(int idx) {
            this.idx = idx;
        }
    }
}
