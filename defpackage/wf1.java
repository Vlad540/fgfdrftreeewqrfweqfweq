package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wf1  reason: default package */
public final class wf1 implements ij1 {
    public final v4b a;
    public final ob1 b;

    public wf1(v4b v4b, ob1 ob1) {
        this.a = v4b;
        this.b = ob1;
        ob1.g.a.add(this);
    }

    public final void a(otf otf) {
        ob1 ob1 = this.b;
        v2d v2d = (v2d) otf.b;
        bgd bgd = (bgd) otf.a;
        if (bgd == null) {
            ob1.i.onRecordStopped(new uf1((ge1) null, v2d));
        } else {
            ob1.i.onRecordStarted(new tf1(v2d, urd.M(bgd)));
        }
    }

    public final void b(JSONObject jSONObject) {
        s5c s5c;
        v4b v4b = this.a;
        v4b.getClass();
        try {
            bgd i = v4b.i(jSONObject.getJSONObject("recordInfo"));
            ((jk9) v4b.c).getClass();
            s5c = new s5c(i, jk9.q(jSONObject), false, 3);
        } catch (JSONException e) {
            ((xwb) v4b.b).logException("RecordInfoParser", "Can't parse record start info", e);
            s5c = null;
        }
        if (s5c != null) {
            this.b.i.onRecordStarted(new tf1((w2d) s5c.c, urd.M((bgd) s5c.b)));
        }
    }

    public final void c(JSONObject jSONObject) {
        v4b v4b = this.a;
        v4b.getClass();
        f2b f2b = null;
        try {
            String x = r1g.x(jSONObject, "participant");
            ge1 a2 = x != null ? ge1.a(x) : null;
            if (jSONObject.has("recordMovieId")) {
                jSONObject.optLong("recordMovieId");
            }
            ((jk9) v4b.c).getClass();
            f2b = new f2b(jk9.q(jSONObject), a2, false, 6);
        } catch (JSONException e) {
            ((xwb) v4b.b).logException("RecordInfoParser", "Can't parse record stop info", e);
        }
        if (f2b != null) {
            this.b.i.onRecordStopped(new uf1((ge1) f2b.c, (w2d) f2b.b));
        }
    }
}
