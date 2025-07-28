package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* renamed from: rf4  reason: default package */
public abstract class rf4 {
    public static volatile vf4 f;
    public final Context a;
    public final g2b b;
    public final t97 c;
    public PowerManager d;
    public final dbc e = new dbc(new gz3(2, this));

    public rf4(Context context, g2b g2b, t97 t97) {
        this.a = context;
        this.b = g2b;
        WeakReference weakReference = new WeakReference(this);
        yzc yzc = ((j2b) g2b).b;
        yzc.m.add(new qf4(this, 0, weakReference));
        this.c = t97;
    }

    public final String a() {
        j2b j2b = (j2b) this.b;
        String str = null;
        String string = j2b.a.g.getString("device.id", (String) null);
        if (r1g.p(string)) {
            udd.q("rf4", "New device id generated");
            try {
                string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
            } catch (Exception e2) {
                udd.s("rf4", "Can't get hardware device id", e2);
                string = null;
            }
            if (r1g.p(string)) {
                b9e b9e = (b9e) ((tf4) this).i.getValue();
                b9e.getClass();
                try {
                    str = b9e.f();
                } catch (Exception e3) {
                    udd.s(b9e.a, "error while get instance id", e3);
                }
                string = !r1g.p(str) ? str : UUID.randomUUID().toString();
            }
            j2b.a.l("device.id", string);
        }
        return string;
    }

    public final vf4 b() {
        if (f == null) {
            f = swb.D(this.a);
        }
        return f;
    }

    public abstract boolean c();

    public final boolean d() {
        return ((kdf) ((aq) this.c.getValue())).c();
    }

    public abstract void e();

    public abstract void f(String str);

    public abstract void g(String str);

    public abstract uye h();
}
