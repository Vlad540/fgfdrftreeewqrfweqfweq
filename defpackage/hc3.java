package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: hc3  reason: default package */
public final class hc3 extends RecyclerView implements mhe, cx6 {
    public static final /* synthetic */ k77[] g2;
    public boolean Z1 = true;
    public dc3 a2;
    public final fc3 b2;
    public s16 c2;
    public final fc3 d2;
    public u16 e2;
    public final vkd f2;

    static {
        Class<hc3> cls = hc3.class;
        g2 = new k77[]{new hc9(cls, "state", "getState()Lone/me/sdk/codeinput/ConfirmSmsInputView$State;"), c3d.g(m7c.a, cls, "countCells", "getCountCells()I")};
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [hc3, android.view.View, androidx.recyclerview.widget.RecyclerView] */
    public hc3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ec3 ec3 = ec3.SUCCESS;
        this.b2 = new fc3(this, 0);
        this.c2 = new cc3(context, 0);
        this.d2 = new fc3(this, 1);
        this.f2 = new vkd(paf.b(this));
        setLayoutManager(new LinearLayoutManager(0, false));
        j(new iq(4));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [hc3, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList G0(defpackage.hc3 r4) {
        /*
            r4.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.getChildCount()
            r2 = 0
        L_0x000d:
            if (r2 >= r1) goto L_0x001b
            hx6 r3 = r4.H0(r2)
            if (r3 == 0) goto L_0x0018
            r0.add(r3)
        L_0x0018:
            int r2 = r2 + 1
            goto L_0x000d
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc3.G0(hc3):java.util.ArrayList");
    }

    private final hx6 getFirstEmptyInputController() {
        Object obj;
        Iterator it = G0(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jkd) ((hx6) obj)).A().length() == 0) {
                break;
            }
        }
        return (hx6) obj;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [hc3, android.view.ViewGroup] */
    /* access modifiers changed from: private */
    public final void setInputsEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            hx6 H0 = H0(i);
            if (H0 != null) {
                jkd jkd = (jkd) H0;
                bc3 bc3 = jkd.L0;
                if (!z && ((Boolean) jkd.M0.Y.invoke()).booleanValue()) {
                    bm3.r(bc3);
                }
                bc3.setClickable(z);
                bc3.setFocusable(z);
                bc3.setFocusableInTouchMode(z);
            }
        }
    }

    public final hx6 H0(int i) {
        hx6 M = M(i);
        if (M instanceof hx6) {
            return M;
        }
        return null;
    }

    public final boolean I0(int i) {
        return i >= 0 && i <= getCountCells();
    }

    public final void J0(int i, String str) {
        if (I0(i) && I0(str.length())) {
            int length = str.length();
            for (int i2 = i; i2 < length; i2++) {
                int i3 = i2 - i;
                hx6 H0 = H0(i2);
                if (H0 != null) {
                    ((jkd) H0).B(String.valueOf(h0e.W(i3, str)));
                }
            }
        }
    }

    public final boolean K0() {
        hx6 firstEmptyInputController = getFirstEmptyInputController();
        Boolean valueOf = firstEmptyInputController != null ? Boolean.valueOf(((jkd) firstEmptyInputController).L0.requestFocus()) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    public final void L0() {
        hx6 firstEmptyInputController = getFirstEmptyInputController();
        if (firstEmptyInputController != null) {
            bm3.H(((jkd) firstEmptyInputController).L0);
        }
    }

    public final int getCountCells() {
        k77 k77 = g2[1];
        return ((Number) this.d2.b).intValue();
    }

    public final boolean getDisableInputsForError() {
        return this.Z1;
    }

    public final dc3 getListener() {
        return this.a2;
    }

    public final u16 getOnAnimationEnded() {
        return this.e2;
    }

    public final ec3 getState() {
        k77 k77 = g2[0];
        return (ec3) this.b2.b;
    }

    public final void onDetachedFromWindow() {
        vkd vkd = this.f2;
        vkd.b();
        k77[] k77Arr = vkd.e;
        k77 k77 = k77Arr[1];
        e3 e3Var = vkd.d;
        g37 g37 = (g37) e3Var.T0(vkd, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(vkd, k77Arr[1], (Object) null);
        hc3.super.onDetachedFromWindow();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [hc3, android.view.View, android.view.ViewGroup] */
    public final void onThemeChanged(pda pda) {
        int i = km4.y0.r(this).i(getState().a);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            hx6 H0 = H0(i2);
            if (H0 != null) {
                bc3 bc3 = ((jkd) H0).L0;
                bc3 bc32 = bc3 instanceof mhe ? bc3 : null;
                if (bc32 != null) {
                    bc32.onThemeChanged(pda);
                }
                bc3.setTextColor(i);
            }
        }
    }

    public final boolean requestFocus(int i, Rect rect) {
        return K0();
    }

    public final void setCountCells(int i) {
        this.d2.o1(this, g2[1], Integer.valueOf(i));
    }

    public final void setDisableInputsForError(boolean z) {
        this.Z1 = z;
    }

    public final void setKeyboardOpen(s16 s16) {
        this.c2 = s16;
    }

    public final void setListener(dc3 dc3) {
        this.a2 = dc3;
    }

    public final void setOnAnimationEnded(u16 u16) {
        this.e2 = u16;
    }

    public final void setSecure(boolean z) {
        kkd adapter = getAdapter();
        kkd kkd = adapter instanceof kkd ? adapter : null;
        if (kkd != null) {
            kkd.Z.o1(kkd, kkd.w0[0], Boolean.valueOf(z));
        }
    }

    public final void setState(ec3 ec3) {
        this.b2.o1(this, g2[0], ec3);
    }
}
