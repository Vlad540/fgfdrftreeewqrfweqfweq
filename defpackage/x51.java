package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import one.me.rlottie.RLottieImageView;

/* renamed from: x51  reason: default package */
public final class x51 extends b97 implements u16 {
    public static final x51 A0 = new x51(1, 10);
    public static final x51 B0 = new x51(1, 11);
    public static final x51 C0 = new x51(1, 12);
    public static final x51 D0 = new x51(1, 13);
    public static final x51 E0 = new x51(1, 14);
    public static final x51 F0 = new x51(1, 15);
    public static final x51 X = new x51(1, 3);
    public static final x51 Y = new x51(1, 4);
    public static final x51 Z = new x51(1, 5);
    public static final x51 b = new x51(1, 0);
    public static final x51 c = new x51(1, 1);
    public static final x51 o = new x51(1, 2);
    public static final x51 w0 = new x51(1, 6);
    public static final x51 x0 = new x51(1, 7);
    public static final x51 y0 = new x51(1, 8);
    public static final x51 z0 = new x51(1, 9);
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x51(int i, int i2) {
        super(i);
        this.a = i2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof cga);
            case 1:
                return Boolean.valueOf(obj instanceof dh6);
            case 2:
                return Boolean.valueOf(obj instanceof r91);
            case 3:
                return Boolean.valueOf(obj instanceof zc1);
            case 4:
                StringBuilder sb = new StringBuilder("- ");
                sb.append("Object(type=" + ((Class) obj).getName() + ')');
                return sb.toString();
            case 5:
                return Boolean.valueOf(obj instanceof RLottieImageView);
            case 6:
                return ((dyc) obj).iterator();
            case 7:
                return ((Iterable) obj).iterator();
            case 8:
                return obj;
            case 9:
                return Boolean.valueOf(obj == null);
            case 10:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            case 11:
                return ((boe) obj).getClass().getName();
            case 12:
                return ((coe) obj).getClass().getName();
            case 13:
                return Boolean.valueOf(obj instanceof RecyclerView);
            case 14:
                ViewParent parent = ((View) obj).getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                Object tag = ((View) obj).getTag(drb.view_tree_lifecycle_owner);
                if (tag instanceof nc7) {
                    return (nc7) tag;
                }
                return null;
        }
    }
}
