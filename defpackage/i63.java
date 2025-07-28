package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: i63  reason: default package */
public final /* synthetic */ class i63 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i63(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                for (u16 u16 : (u16[]) this.b) {
                    int f = gp0.f((Comparable) u16.invoke(obj), (Comparable) u16.invoke(obj2));
                    if (f != 0) {
                        return f;
                    }
                }
                return 0;
            case 1:
                tf3 tf3 = (tf3) obj2;
                long n = ((tf3) obj).n();
                xb9 xb9 = (xb9) this.b;
                int b2 = xb9.b(n);
                long j = 0;
                long j2 = b2 >= 0 ? xb9.c[b2] : 0;
                int b3 = xb9.b(tf3.n());
                if (b3 >= 0) {
                    j = xb9.c[b3];
                }
                return pfa.f(j2, j);
            case 2:
                return kn3.a((tf3) obj, (tf3) obj2, (Collator) ((kn3) this.b).a.e());
            case 3:
                d38 d38 = (d38) this.b;
                return d38.a(obj2) - d38.a(obj);
            case 4:
                e38 e38 = (e38) this.b;
                return e38.a(obj2) - e38.a(obj);
            case 5:
                ra0 ra0 = (ra0) obj2;
                ((ga3) this.b).getClass();
                Class<MediaCodec> cls = ((ra0) obj).a.j;
                int i = 1;
                Class<b3b> cls2 = b3b.class;
                Class<MediaCodec> cls3 = MediaCodec.class;
                int i2 = cls == cls3 ? 2 : cls == cls2 ? 0 : 1;
                Class<MediaCodec> cls4 = ra0.a.j;
                if (cls4 == cls3) {
                    i = 2;
                } else if (cls4 == cls2) {
                    i = 0;
                }
                return i2 - i;
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                int width = size.getWidth();
                Rect rect = (Rect) this.b;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(width - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}
