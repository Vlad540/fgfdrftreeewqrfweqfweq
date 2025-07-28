package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: vf8  reason: default package */
public abstract class vf8 extends vfe implements f78 {
    public static final /* synthetic */ k77[] F0;
    public final yj E0 = new yj(12, this);

    static {
        k77 hc9 = new hc9(vf8.class, "model", "getModel()Lone/me/messages/list/loader/model/MediaAttachInfo;");
        m7c.a.getClass();
        F0 = new k77[]{hc9};
    }

    public vf8(Context context) {
        super(context);
    }

    public void a(w13 w13) {
        setModel(w13);
    }

    public sy7 getModel() {
        k77 k77 = F0[0];
        return (sy7) this.E0.b;
    }

    public void i(wid wid) {
        setModel(wid);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float f = (float) 10;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        int i7 = 0;
        if (ek8.L(getSenderNameViewStub$message_list_release().b)) {
            int X2 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
            getSenderNameViewStub$message_list_release().c(X, X2);
            i5 = getSenderNameViewStub$message_list_release().a() + X2;
        } else {
            i5 = 0;
        }
        if (ek8.L((t97) getSenderAliasDelegate().c) && ek8.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().T((getMeasuredWidth() - X) - getSenderAliasDelegate().L(), me4.c((float) 8, dh4.c().getDisplayMetrics().density, (getSenderNameViewStub$message_list_release().a() / 2) - (getSenderAliasDelegate().K() / 2)));
        }
        if (ek8.L((t97) getMessageLinkDelegate().c)) {
            int X3 = i5 + a24.X((i5 == 0 ? (float) 8 : (float) 4) * dh4.c().getDisplayMetrics().density);
            getMessageLinkDelegate().T(X, X3);
            i5 = X3 + getMessageLinkDelegate().K();
        }
        if (v()) {
            float f2 = (float) 1;
            int X4 = a24.X(dh4.c().getDisplayMetrics().density * f2) + (i5 == 0 ? 0 : me4.c((float) 8, dh4.c().getDisplayMetrics().density, i5));
            int c = me4.c((float) 6, dh4.c().getDisplayMetrics().density, b(a24.X(f2 * dh4.c().getDisplayMetrics().density), X4) + X4);
            n1g.D(getMessageTextView$message_list_release(), X, c, 0, 12);
            i6 = me4.c((float) 8, dh4.c().getDisplayMetrics().density, getMessageTextView$message_list_release().getMeasuredHeight() + c);
        } else {
            int c2 = me4.c((float) 8, dh4.c().getDisplayMetrics().density, i5);
            n1g.D(getMessageTextView$message_list_release(), X, c2, 0, 12);
            float f3 = (float) 1;
            int b = rf0.b(f3, dh4.c().getDisplayMetrics().density, a24.X(((float) 6) * dh4.c().getDisplayMetrics().density), getMessageTextView$message_list_release().getMeasuredHeight() + c2);
            i6 = b + b(a24.X(f3 * dh4.c().getDisplayMetrics().density), b);
        }
        int measuredWidth = getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth();
        if (!v()) {
            f = (float) 4;
        }
        n1g.D(getDate$message_list_release(), measuredWidth - a24.X(f * dh4.c().getDisplayMetrics().density), ((v() ? getMeasuredHeight() : i6) - getDate$message_list_release().getMeasuredHeight()) - getStatusBottomMargin$message_list_release(), 0, 12);
        if (ek8.L((t97) getReactionsDelegate().c) && v()) {
            getReactionsDelegate().T(X, i6);
        } else if (ek8.L((t97) getReactionsDelegate().c)) {
            int c3 = me4.c((float) 4, dh4.c().getDisplayMetrics().density, i6);
            nzb reactionsDelegate = getReactionsDelegate();
            if (getReactionsDelegate().Z) {
                i7 = getMeasuredWidth() - getReactionsDelegate().L();
            }
            reactionsDelegate.T(i7, c3);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        float f = (float) 10;
        int l = rf0.l(f, dh4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        getMessageTextView$message_list_release().h();
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : Math.max(me4.c(f, dh4.c().getDisplayMetrics().density, getSuggestedMinimumWidth()), (a24.X(dh4.c().getDisplayMetrics().density * f) * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
        if (ek8.L((t97) getSenderAliasDelegate().c) && ek8.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            size = Math.max(size, getSenderAliasDelegate().L());
        }
        int i4 = 0;
        if (ek8.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            size = Math.max(size, (a24.X(dh4.c().getDisplayMetrics().density * f) * 2) + getSenderNameViewStub$message_list_release().b() + getSenderAliasDelegate().h0());
            i3 = getSenderNameViewStub$message_list_release().a() + a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        } else {
            i3 = 0;
        }
        if (ek8.L((t97) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            size = Math.max(size, (a24.X(dh4.c().getDisplayMetrics().density * f) * 2) + getMessageLinkDelegate().L());
            i3 += getMessageLinkDelegate().K() + a24.X((i3 == 0 ? (float) 8 : (float) 4) * dh4.c().getDisplayMetrics().density);
        }
        if (i3 != 0 && v()) {
            i4 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        }
        int i5 = i3 + i4;
        getDate$message_list_release().measure(i, i2);
        if (ek8.L((t97) getReactionsDelegate().c) && v()) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            size = Math.max(size, (a24.X(dh4.c().getDisplayMetrics().density * f) * 2) + getReactionsDelegate().L());
            i5 = rf0.b(f, dh4.c().getDisplayMetrics().density, getReactionsDelegate().K(), i5);
        } else if (ek8.L((t97) getReactionsDelegate().c)) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i2);
            size = Math.max(size, getReactionsDelegate().L());
            int c = me4.c((float) 8, dh4.c().getDisplayMetrics().density, getReactionsDelegate().K() + a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
            i5 += c;
            ((on8) getBackground()).w = (float) c;
        } else {
            ((on8) getBackground()).w = 0.0f;
        }
        int max = Math.max(size, (a24.X(dh4.c().getDisplayMetrics().density * f) * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
        float f2 = (float) 6;
        int b = rf0.b((float) 8, dh4.c().getDisplayMetrics().density, getMessageTextView$message_list_release().getMeasuredHeight() + a24.X(dh4.c().getDisplayMetrics().density * f2), i5);
        if (v()) {
            int L = ek8.L((t97) getReactionsDelegate().c) ? getReactionsDelegate().L() : getMessageTextView$message_list_release().e(l);
            int measuredWidth = getDate$message_list_release().getMeasuredWidth() + a24.X(f2 * dh4.c().getDisplayMetrics().density);
            if (l - L < measuredWidth) {
                b = me4.c((float) 12, dh4.c().getDisplayMetrics().density, b);
            } else if ((max - (a24.X(dh4.c().getDisplayMetrics().density * f) * 2)) - L < measuredWidth) {
                max += measuredWidth - ((max - (a24.X(f * dh4.c().getDisplayMetrics().density) * 2)) - L);
            }
        }
        float f3 = (float) 1;
        long s = s(max, rf0.l(f3, dh4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i)), i, i2);
        setMeasuredDimension(Math.max(max, (a24.X(dh4.c().getDisplayMetrics().density * f3) * 2) + ((int) (s >> 32))), (a24.X(f3 * dh4.c().getDisplayMetrics().density) * 2) + ((int) (s & 4294967295L)) + b);
    }

    public void p(qhd qhd) {
        setModel(qhd);
    }

    public void setModel(sy7 sy7) {
        this.E0.o1(this, F0[0], sy7);
    }

    public final boolean v() {
        sy7 model = getModel();
        return model != null && model.c();
    }

    public final void w(dr0 dr0) {
        if (v()) {
            getDate$message_list_release().setTextColor$message_list_release(dr0.b.f);
        }
    }
}
