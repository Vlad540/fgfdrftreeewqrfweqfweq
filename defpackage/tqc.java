package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: tqc  reason: default package */
public final /* synthetic */ class tqc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vqc b;

    public /* synthetic */ tqc(vqc vqc, int i) {
        this.a = i;
        this.b = vqc;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                vqc vqc = this.b;
                vqc.getClass();
                return jk0.z(Integer.valueOf((int) vqc.o(PmsKey.f24debugmode, (long) 0)));
            case 1:
                vqc vqc2 = this.b;
                bs bsVar = xzc.a;
                try {
                    PmsKey pmsKey = PmsKey.f95reacterrors;
                    vqc2.getClass();
                    List g = vqc2.g(pmsKey.name(), (List) null);
                    return g != null ? new bs(g) : bsVar;
                } catch (Throwable th) {
                    udd.s(vqc2.e, "reactErrors parse failure!", th);
                    return bsVar;
                }
            case 2:
                return Boolean.valueOf(this.b.m(PmsKey.f100savedmessagesenabled, false));
            default:
                PmsKey pmsKey2 = PmsKey.f120videopreview;
                vqc vqc3 = this.b;
                String v = vqc3.v(pmsKey2, (String) null);
                int i = 480;
                int i2 = 270;
                if (v == null || v.length() == 0) {
                    return new wia(480, 270);
                }
                try {
                    Matcher matcher = ((Pattern) vqc.p.getValue()).matcher(v.toUpperCase(Locale.US));
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        if (group != null) {
                            i = Integer.parseInt(group);
                            String group2 = matcher.group(2);
                            if (group2 != null) {
                                i2 = Integer.parseInt(group2);
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                } catch (Throwable th2) {
                    udd.u(vqc3.e, th2, "invalid video preview template %s", new Object[]{v});
                }
                return new wia(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
