package com.example.projectdemo;

public class QQbean {

    /**
     * error_code : 0
     * reason : success
     * result : {"data":{"conclusion":"[大吉+财运+才艺]不可意气，善用智慧，如能慎始，必可昌隆","analysis":"家门隆昌精神爽，博得名利星月朗，权威智谋极周全，君是天下富贵翁。具有此数之人，男则勇敢果断，而女则美貌如仙子，有风流不羁(不顾时局大体)倾向，若修养不够或抑制力不强，往往因桃色事件惹来麻烦。"}}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * data : {"conclusion":"[大吉+财运+才艺]不可意气，善用智慧，如能慎始，必可昌隆","analysis":"家门隆昌精神爽，博得名利星月朗，权威智谋极周全，君是天下富贵翁。具有此数之人，男则勇敢果断，而女则美貌如仙子，有风流不羁(不顾时局大体)倾向，若修养不够或抑制力不强，往往因桃色事件惹来麻烦。"}
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * conclusion : [大吉+财运+才艺]不可意气，善用智慧，如能慎始，必可昌隆
             * analysis : 家门隆昌精神爽，博得名利星月朗，权威智谋极周全，君是天下富贵翁。具有此数之人，男则勇敢果断，而女则美貌如仙子，有风流不羁(不顾时局大体)倾向，若修养不够或抑制力不强，往往因桃色事件惹来麻烦。
             */

            private String conclusion;
            private String analysis;

            public String getConclusion() {
                return conclusion;
            }

            public void setConclusion(String conclusion) {
                this.conclusion = conclusion;
            }

            public String getAnalysis() {
                return analysis;
            }

            public void setAnalysis(String analysis) {
                this.analysis = analysis;
            }
        }
    }
}
