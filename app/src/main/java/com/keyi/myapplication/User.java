package com.keyi.myapplication;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */
public class User {


    /**
     * error : false
     * results : [{"_id":"582a67c2421aa910344b13bb","createdAt":"2016-11-15T09:41:22.418Z","desc":"我的大飞机能停在你的飞机场吗\u2026污得无法无天[哆啦A梦吃惊]","publishedAt":"2016-11-17T11:32:04.807Z","source":"chrome","type":"休息视频","url":"http://www.miaopai.com/show/jluFkzvSIdrmHUQ3K8keMQ__.htm","used":true,"who":"lxxself"},{"_id":"582a67ac421aa9102c2ec6e9","createdAt":"2016-11-15T09:41:00.851Z","desc":"人生问题：为什么吵架永远吵不过女朋友 男生内心： 你，经历过绝望吗？ ","publishedAt":"2016-11-16T11:37:18.947Z","source":"chrome","type":"休息视频","url":"http://weibo.com/tv/v/EhxXTv9K7?fid=1034:82d69e08660431770e24fc4e48c7206d","used":true,"who":"lxxself"},{"_id":"5829d423421aa911e32d87ef","createdAt":"2016-11-14T23:11:31.665Z","desc":"科普：手机触屏是什么原理","publishedAt":"2016-11-15T11:26:11.821Z","source":"chrome","type":"休息视频","url":"http://www.bilibili.com/video/av7056496/","used":true,"who":"LHF"},{"_id":"58282b1b421aa911e32d87d6","createdAt":"2016-11-13T16:58:03.159Z","desc":"生活在大城市真的很令人沮丧 ","publishedAt":"2016-11-14T11:36:49.680Z","source":"chrome","type":"休息视频","url":"http://v.qq.com/x/page/h0345y1u60h.html","used":true,"who":"lxxself"},{"_id":"5824882e421aa90e799ec2be","createdAt":"2016-11-10T22:46:06.167Z","desc":"暴雪游戏25年","publishedAt":"2016-11-11T12:03:10.196Z","source":"chrome","type":"休息视频","url":"http://www.bilibili.com/video/av7026930/","used":true,"who":"LHF"},{"_id":"5823372a421aa91369f95a1b","createdAt":"2016-11-09T22:48:10.70Z","desc":"新鲜的四六级资料已到货：特朗普胜选演讲双语字幕版 ","publishedAt":"2016-11-10T11:40:42.4Z","source":"chrome","type":"休息视频","url":"http://weibo.com/tv/v/EgMsAbOaI?fid=1034:037eab745ddcbc30e436e78cdae67900","used":true,"who":"lxxself"},{"_id":"581fdce8421aa90e6f21b4ca","createdAt":"2016-11-07T09:46:16.663Z","desc":"一些反人类的句子，莫名戳中我的笑点~比起心灵鸡汤，这些反鸡汤语录好像也有些道理呢！~[笑cry]","publishedAt":"2016-11-09T11:40:48.268Z","source":"chrome","type":"休息视频","url":"http://www.miaopai.com/show/K7z4TCIMuKbaIur-7SxCBA__.htm","used":true,"who":"lxxself"},{"_id":"581df5f4421aa90e799ec27e","createdAt":"2016-11-05T23:08:36.855Z","desc":"治愈动画短片《鹬》","publishedAt":"2016-11-08T11:51:41.578Z","source":"chrome","type":"休息视频","url":"http://weibo.com/tv/v/Eg1TMxivO?from=vhot","used":true,"who":"LHF"},{"_id":"581f3725421aa9137697463d","createdAt":"2016-11-06T21:59:01.885Z","desc":"感人广告《假如有人出10亿让我放弃你》","publishedAt":"2016-11-07T11:47:36.373Z","source":"chrome","type":"休息视频","url":"http://v.youku.com/v_show/id_XMTc2Mzc2MzA5Mg==.html","used":true,"who":"lxxself"},{"_id":"581a02fe421aa90e799ec260","createdAt":"2016-11-02T23:15:10.386Z","desc":"男友忠诚度测试[doge] 这是毁事的节奏啊！[偷笑]","publishedAt":"2016-11-04T11:48:56.654Z","source":"chrome","type":"休息视频","url":"http://www.miaopai.com/show/ZonudCUkw1bc2ozLS1umcQ__.htm","used":true,"who":"LHF"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 582a67c2421aa910344b13bb
         * createdAt : 2016-11-15T09:41:22.418Z
         * desc : 我的大飞机能停在你的飞机场吗…污得无法无天[哆啦A梦吃惊]
         * publishedAt : 2016-11-17T11:32:04.807Z
         * source : chrome
         * type : 休息视频
         * url : http://www.miaopai.com/show/jluFkzvSIdrmHUQ3K8keMQ__.htm
         * used : true
         * who : lxxself
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
