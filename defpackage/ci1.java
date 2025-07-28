package defpackage;

import androidx.recyclerview.widget.b;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ci1  reason: default package */
public final /* synthetic */ class ci1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aj1 b;

    public /* synthetic */ ci1(aj1 aj1, int i) {
        this.a = i;
        this.b = aj1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((jb5) this.b.y0.getValue()).r());
            case 1:
                kb5 kb5 = (jb5) this.b.y0.getValue();
                kb5.getClass();
                return Boolean.valueOf(kb5.m(PmsKey.gsse, false));
            case 2:
                kb5 kb52 = (jb5) this.b.y0.getValue();
                kb52.getClass();
                return Boolean.valueOf(kb52.m(PmsKey.sse, false));
            case 3:
                kb5 kb53 = (jb5) this.b.y0.getValue();
                kb53.getClass();
                return Boolean.valueOf(kb53.m(PmsKey.grse, false));
            default:
                int i = this.b.x0.e ? 6 : 8;
                b bVar = new b();
                bVar.setMaxRecycledViews(1, i);
                return bVar;
        }
    }
}
