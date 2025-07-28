package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: sqc  reason: default package */
public abstract class sqc extends f3 {
    public final vqc h;

    public sqc(Context context, we5 we5, vqc vqc) {
        super(context, "features_prefs", we5);
        this.h = vqc;
    }

    public final boolean m(PmsKey pmsKey, boolean z) {
        Boolean bool;
        Boolean valueOf = Boolean.valueOf(z);
        boolean contains = this.g.contains(pmsKey.name());
        this = this;
        if (!contains) {
            this = this.h;
        }
        Class<Boolean> cls = Boolean.class;
        xy2 a = m7c.a(cls);
        if (a.equals(m7c.a(Boolean.TYPE))) {
            bool = Boolean.valueOf(this.c(pmsKey.name(), z));
        } else if (a.equals(m7c.a(Long.TYPE))) {
            bool = (Boolean) Long.valueOf(this.g.getLong(pmsKey.name(), ((Long) valueOf).longValue()));
        } else if (a.equals(m7c.a(String.class))) {
            String string = this.g.getString(pmsKey.name(), (String) valueOf);
            if (string != null) {
                bool = (Boolean) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        } else {
            xy2 a2 = m7c.a(cls);
            throw new IllegalArgumentException("Unsupported type: " + a2);
        }
        return bool.booleanValue();
    }

    public final long n(PmsKey pmsKey) {
        Long l;
        boolean contains = this.g.contains(pmsKey.name());
        this = this;
        if (!contains) {
            this = this.h;
        }
        Class<Long> cls = Long.class;
        xy2 a = m7c.a(cls);
        if (a.equals(m7c.a(Boolean.TYPE))) {
            l = (Long) Boolean.valueOf(this.c(pmsKey.name(), ((Boolean) 0L).booleanValue()));
        } else if (a.equals(m7c.a(Long.TYPE))) {
            l = Long.valueOf(this.g.getLong(pmsKey.name(), 0));
        } else if (a.equals(m7c.a(String.class))) {
            String string = this.g.getString(pmsKey.name(), (String) 0L);
            if (string != null) {
                l = (Long) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
        } else {
            xy2 a2 = m7c.a(cls);
            throw new IllegalArgumentException("Unsupported type: " + a2);
        }
        return l.longValue();
    }
}
