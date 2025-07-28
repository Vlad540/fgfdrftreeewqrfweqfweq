package defpackage;

import java.util.Comparator;
import one.me.devmenu.DevMenuScreen;

/* renamed from: if4  reason: default package */
public final /* synthetic */ class if4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ i26 b;

    public /* synthetic */ if4(i26 i26, int i) {
        this.a = i;
        this.b = i26;
    }

    public final int compare(Object obj, Object obj2) {
        i26 i26 = this.b;
        switch (this.a) {
            case 0:
                int i = DevMenuScreen.x0;
                return ((Number) i26.invoke(obj, obj2)).intValue();
            case 1:
                return ((Number) i26.invoke(obj, obj2)).intValue();
            default:
                return ((Number) i26.invoke(obj, obj2)).intValue();
        }
    }
}
