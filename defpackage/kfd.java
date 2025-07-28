package defpackage;

import org.json.JSONObject;

/* renamed from: kfd  reason: default package */
public final /* synthetic */ class kfd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mfd b;
    public final /* synthetic */ lfd c;
    public final /* synthetic */ JSONObject o;

    public /* synthetic */ kfd(mfd mfd, lfd lfd, JSONObject jSONObject, int i) {
        this.a = i;
        this.b = mfd;
        this.c = lfd;
        this.o = jSONObject;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                lfd lfd = this.c;
                mfd mfd = this.b;
                xwb xwb = mfd.b;
                try {
                    boolean z = lfd instanceof wu0;
                    JSONObject jSONObject = this.o;
                    if (z) {
                        ((wu0) lfd).k(jSONObject);
                        return;
                    } else if (mfd.p) {
                        lfd.k(jSONObject);
                        return;
                    } else {
                        xwb.log("OKSignaling", "<!> ignoring " + jSONObject);
                        return;
                    }
                } catch (Exception e) {
                    xwb.reportException("OKSignaling", "signaling.response", e);
                    return;
                }
            default:
                lfd lfd2 = this.c;
                mfd mfd2 = this.b;
                xwb xwb2 = mfd2.b;
                try {
                    boolean z2 = lfd2 instanceof wu0;
                    JSONObject jSONObject2 = this.o;
                    if (z2) {
                        ((wu0) lfd2).k(jSONObject2);
                        return;
                    } else if (mfd2.p) {
                        lfd2.k(jSONObject2);
                        return;
                    } else {
                        xwb2.log("OKSignaling", "<!> ignoring " + jSONObject2);
                        return;
                    }
                } catch (Exception e2) {
                    xwb2.reportException("OKSignaling", "signaling.response", e2);
                    return;
                }
        }
    }
}
