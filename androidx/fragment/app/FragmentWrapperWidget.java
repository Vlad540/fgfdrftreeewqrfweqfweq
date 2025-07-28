package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.messages.location.FrgLocationMap;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/FragmentWrapperWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "", "fragmentId", "Ljava/lang/Class;", "Landroidx/fragment/app/a;", "fragmentClass", "", "fragmentTag", "Landroid/os/Bundle;", "args", "(ILjava/lang/Class;Ljava/lang/String;Landroid/os/Bundle;)V", "arch_release"}, k = 1, mv = {2, 0, 0})
public final class FragmentWrapperWidget extends Widget {
    public static final /* synthetic */ k77[] X;
    public final jr a;
    public final jr b;
    public final jr c;
    public final jr o;

    static {
        Class<FragmentWrapperWidget> cls = FragmentWrapperWidget.class;
        X = new k77[]{new hc9(cls, "fragmentId", "getFragmentId()I"), c3d.g(m7c.a, cls, "fragmentClass", "getFragmentClass()Ljava/lang/String;"), new hc9(cls, "fragmentTag", "getFragmentTag()Ljava/lang/String;"), new hc9(cls, "fragmentArgs", "getFragmentArgs()Landroid/os/Bundle;")};
    }

    public FragmentWrapperWidget() {
        super((Bundle) null, 0, 3, (x54) null);
        this.a = new jr(Integer.class, "widget:fragment:id");
        Class<String> cls = String.class;
        this.b = new jr(cls, ":widget:fragment:class");
        this.c = new jr(cls, "widget:fragment:tag");
        this.o = new jr(Bundle.class, "widget:fragment:args");
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, androidx.fragment.app.FragmentWrapperWidget] */
    public final vx5 l0() {
        Activity activity = getActivity();
        im imVar = activity instanceof im ? (im) activity : null;
        if (imVar != null) {
            return imVar.P();
        }
        return null;
    }

    public final a m0() {
        vx5 l0 = l0();
        if (l0 == null) {
            return null;
        }
        k77 k77 = X[0];
        return l0.D(((Number) this.a.a(this)).intValue());
    }

    public final void onAttach(View view) {
        a m0 = m0();
        if (m0 != null) {
            m0.v0(getContext());
        }
    }

    public final void onChangeEnded(wr3 wr3, xr3 xr3) {
        vx5 l0;
        a m0;
        if (!xr3.b && (l0 = l0()) != null && (m0 = m0()) != null) {
            hd0 hd0 = new hd0(l0);
            hd0.h(m0);
            hd0.d(true);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [rr3, one.me.sdk.arch.Widget, androidx.fragment.app.FragmentWrapperWidget] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        k77[] k77Arr = X;
        k77 k77 = k77Arr[0];
        frameLayout.setId(((Number) this.a.a(this)).intValue());
        vx5 l0 = l0();
        if (l0 == null) {
            return frameLayout;
        }
        a D = l0.D(frameLayout.getId());
        k77 k772 = k77Arr[1];
        String str = (String) this.b.a(this);
        gy5 gy5 = null;
        if (D == null) {
            nx5 J = l0.J();
            frameLayout.getContext().getClassLoader();
            D = J.a(str);
            int i = D.N0;
            D.N0 = i;
            D.O0 = i;
            D.P0 = D.P0;
            D.J0 = l0;
            D.K0 = l0.w;
            k77 k773 = k77Arr[3];
            D.Y0((Bundle) this.o.a(this));
            frameLayout.getContext();
            D.G0((AttributeSet) null, bundle);
            hd0 hd0 = new hd0(l0);
            hd0.o = true;
            k77 k774 = k77Arr[2];
            D.X0 = frameLayout;
            D.F0 = true;
            hd0.f(frameLayout.getId(), D, (String) this.c.a(this), 1);
            if (!hd0.g) {
                hd0.q.B(hd0, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        FrgLocationMap frgLocationMap = D instanceof FrgLocationMap ? (FrgLocationMap) D : null;
        if (frgLocationMap != null) {
            ArrayList e = getRouter().e();
            ListIterator listIterator = e.listIterator(e.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((vgc) obj).a instanceof gy5) {
                    break;
                }
            }
            vgc vgc = (vgc) obj;
            gy5 gy52 = vgc != null ? vgc.a : null;
            if (gy52 instanceof gy5) {
                gy5 = gy52;
            }
            frgLocationMap.F1 = gy5;
        }
        View view = D.Y0;
        if (view != null && view.getParent() == null) {
            D.X0 = frameLayout;
            e g = l0.g(D);
            g.b();
            g.k();
        }
        return frameLayout;
    }

    public final void onDestroy() {
        a m0 = m0();
        if (m0 != null) {
            m0.z0();
        }
    }

    public final void onDestroyView(View view) {
        a m0 = m0();
        if (m0 != null) {
            m0.A0();
        }
    }

    public final void onDetach(View view) {
        a m0 = m0();
        if (m0 != null) {
            m0.C0();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentWrapperWidget(int i, Class cls, String str, Bundle bundle, int i2, x54 x54) {
        this(i, cls, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : bundle);
    }

    public FragmentWrapperWidget(int i, Class<? extends a> cls, String str, Bundle bundle) {
        this();
        k77[] k77Arr = X;
        k77 k77 = k77Arr[0];
        this.a.b(this, Integer.valueOf(i));
        String name = cls.getName();
        k77 k772 = k77Arr[1];
        this.b.b(this, name);
        k77 k773 = k77Arr[2];
        this.c.b(this, str);
        k77 k774 = k77Arr[3];
        this.o.b(this, bundle);
    }
}
