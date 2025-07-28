package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: qe5  reason: default package */
public final class qe5 extends vfe {
    public static final /* synthetic */ k77[] a1;
    public int E0;
    public final t97 F0;
    public boolean G0;
    public boolean H0;
    public q40 I0;
    public g37 J0;
    public final yj K0 = new yj(9, this);
    public final Rect L0 = new Rect();
    public final t97 M0 = ez3.O(3, new ne5(this, 0));
    public final t97 N0 = ez3.O(3, new ne5(this, 1));
    public final t97 O0 = ez3.O(3, new ne5(this, 2));
    public final ShapeDrawable P0;
    public final t97 Q0;
    public final t97 R0;
    public final t97 S0;
    public final t97 T0;
    public final t97 U0;
    public final OneMeDraweeView V0;
    public final TextView W0;
    public Layout X0;
    public final int Y0;
    public final int Z0;

    static {
        k77 hc9 = new hc9(qe5.class, "model", "getModel()Lone/me/messages/list/loader/model/FileAttachModel;");
        m7c.a.getClass();
        a1 = new k77[]{hc9};
    }

    /* JADX WARNING: type inference failed for: r1v31, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public qe5(Context context) {
        super(context);
        s59 s59 = km4.y0;
        int i = s59.r(this).a().a(true).a.i;
        this.E0 = s59.r(this).a().a(true).c.f;
        this.F0 = ez3.O(3, new cc3(context, 7));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        this.P0 = shapeDrawable;
        this.Q0 = ez3.O(3, new oe5(context, this, 0));
        this.R0 = ez3.O(3, new oe5(context, this, 1));
        this.S0 = ez3.O(3, new oe5(context, this, 2));
        this.T0 = ez3.O(3, new oe5(context, this, 3));
        this.U0 = ez3.O(3, new xd3(28));
        ? oneMeDraweeView = new OneMeDraweeView(context);
        this.V0 = oneMeDraweeView;
        TextView textView = new TextView(context);
        jp2.f.b(textView, yq4.b);
        textView.setMaxLines(1);
        this.W0 = textView;
        this.Y0 = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        this.Z0 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        lu7 lu7 = on8.y;
        pda r = s59.r(this);
        lu7.getClass();
        setBackground(lu7.g(r));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    private final ud5 getActionIconView() {
        return (ud5) this.Q0.getValue();
    }

    private final ImageView getBigPreviewActionIcon() {
        return (ImageView) this.R0.getValue();
    }

    private final qo0 getBlurPostProcessor() {
        return (qo0) this.F0.getValue();
    }

    private final eu3 getCornersOutlineProvider() {
        return (eu3) this.U0.getValue();
    }

    private final pc5 getModel() {
        k77 k77 = a1[0];
        return (pc5) this.K0.b;
    }

    private final int getPreviewActionIconBackgroundColor() {
        km4.y0.r(this).a().o().a.getClass();
        return 1543503872;
    }

    private final int getPreviewActionIconColor() {
        km4.y0.r(this).a().o().c.getClass();
        return -1;
    }

    private final void setModel(pc5 pc5) {
        this.K0.o1(this, a1[0], pc5);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.view.View, xp6] */
    private final void setPreview(pc5 pc5) {
        pc5 pc52 = pc5;
        tp6 tp6 = pc52.k;
        q1f q1f = pc52.l;
        if (!(tp6 == null && q1f == null) && !pc52.m) {
            if (tp6 == null) {
                tp6 = q1f != null ? new tp6(0, q1f.b, q1f.c, q1f.d, false, q1f.e, q1f.h, (hbc) null, false, (String) null, (Uri) null, 3456) : null;
            }
            t97 t97 = this.T0;
            ((View) t97.getValue()).setVisibility(pc52.j == 2 ? 0 : 8);
            if (ek8.L(t97)) {
                c2f c2f = (c2f) t97.getValue();
                if (q1f != null) {
                    long e = zp4.e(q1f.f);
                    String[] strArr = dhe.b;
                    c2f.setContent(d8.a(e));
                }
            }
            if (tp6 != null) {
                ? r1 = (xp6) this.S0.getValue();
                r1.setVisibility(0);
                r1.setImageAttach(tp6);
                OneMeDraweeView oneMeDraweeView = this.V0;
                ur6 d = ur6.d(tp6.b);
                d.d = tp6.h;
                d.l = getBlurPostProcessor();
                oneMeDraweeView.o(d.a(), (tr6) null);
                oneMeDraweeView.getHierarchy().h(tp6.i);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v11, types: [android.view.View, xp6] */
    private final void setState(pc5 pc5) {
        boolean z = false;
        getMessageTextView$message_list_release().setVisibility(pc5.m ? 0 : 8);
        boolean z2 = this.H0;
        t97 t97 = this.R0;
        zqd zqd = pc5.n;
        oc5 oc5 = pc5.i;
        if (z2) {
            t97 t972 = this.Q0;
            if (t972.a()) {
                ((ud5) t972.getValue()).setVisibility(8);
            }
            getBigPreviewActionIcon().setVisibility(0);
            if (oc5 instanceof nc5) {
                z(t97);
            } else if (oc5 instanceof lc5) {
                x(t97);
            } else if (zqd.getValue() == null && (oc5 instanceof mc5)) {
                y(t97, ((mc5) oc5).a);
            }
        } else {
            if (t97.a()) {
                ((ImageView) t97.getValue()).setVisibility(8);
            }
            t97 t973 = this.S0;
            if (t973.a()) {
                ((xp6) t973.getValue()).setVisibility(8);
            }
            this.V0.setVisibility(8);
            getActionIconView().setVisibility(0);
            if (oc5 instanceof nc5) {
                getActionIconView().d();
            } else if (oc5 instanceof lc5) {
                ud5 actionIconView = getActionIconView();
                short s = actionIconView.w0;
                actionIconView.w0 = 2;
                if (s == 2) {
                    z = true;
                }
                boolean z3 = !z;
                boolean a = ((zd5) actionIconView.z0.getValue()).a(pc5.f);
                if (z3 || a) {
                    actionIconView.requestLayout();
                    actionIconView.invalidate();
                }
            } else if (zqd.getValue() == null && (oc5 instanceof mc5)) {
                getActionIconView().c(((mc5) oc5).a);
            }
        }
    }

    private final void setSubtitle(mge mge) {
        if (mge != null) {
            this.W0.setText(mge.a(getContext()));
        }
    }

    public static Drawable v(qe5 qe5) {
        int i = phc.m0;
        int previewActionIconColor = qe5.getPreviewActionIconColor();
        Drawable b = gq3.b(qe5.getContext(), i);
        js.D(b, previewActionIconColor);
        return b;
    }

    public final void A(pc5 pc5) {
        setModel(pc5);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v14, types: [android.view.View, xp6] */
    public final void B(ez ezVar) {
        pc5 model;
        kc5 kc5;
        if (ezVar != null && (model = getModel()) != null && ezVar.a() == model.b) {
            setSubtitle(ezVar.b());
            boolean z = this.H0;
            t97 t97 = this.R0;
            boolean z2 = false;
            if (z) {
                t97 t972 = this.Q0;
                if (t972.a()) {
                    ((ud5) t972.getValue()).setVisibility(8);
                }
                getBigPreviewActionIcon().setVisibility(0);
                if (ezVar instanceof az) {
                    y(t97, ((az) ezVar).b);
                } else if (ezVar instanceof dz) {
                    y(t97, ((dz) ezVar).b);
                } else if (ezVar instanceof bz) {
                    z(t97);
                } else if (ezVar instanceof cz) {
                    x(t97);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (t97.a()) {
                    ((ImageView) t97.getValue()).setVisibility(8);
                }
                t97 t973 = this.S0;
                if (t973.a()) {
                    ((xp6) t973.getValue()).setVisibility(8);
                }
                this.V0.setVisibility(8);
                getActionIconView().setVisibility(0);
                if (ezVar instanceof az) {
                    getActionIconView().c(((az) ezVar).b);
                } else if (ezVar instanceof dz) {
                    getActionIconView().c(((dz) ezVar).b);
                } else if (ezVar instanceof bz) {
                    getActionIconView().d();
                } else if (ezVar instanceof cz) {
                    ud5 actionIconView = getActionIconView();
                    pc5 model2 = getModel();
                    if (model2 == null || (kc5 = model2.f) == null) {
                        kc5 = kc5.UNKNOWN;
                    }
                    short s = actionIconView.w0;
                    actionIconView.w0 = 2;
                    if (s == 2) {
                        z2 = true;
                    }
                    boolean z3 = !z2;
                    boolean a = ((zd5) actionIconView.z0.getValue()).a(kc5);
                    if (z3 || a) {
                        actionIconView.requestLayout();
                        actionIconView.invalidate();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public final void C() {
        pc5 model = getModel();
        if (model != null) {
            this.X0 = model.e;
            setSubtitle(model.g);
            setPreview(model);
            setState(model);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        Layout layout = this.X0;
        if (layout != null) {
            View B = ek8.B(this.Q0);
            if (B != null) {
                i = getContentHorizontalPadding$message_list_release() + B.getMeasuredWidth();
            } else {
                i = 0;
            }
            int i2 = this.Y0 + i;
            int save = canvas.save();
            canvas.translate((float) i2, (float) (this.W0.getTop() - layout.getHeight()));
            try {
                layout.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final void g(CharSequence charSequence, boolean z) {
        h04 date$message_list_release = getDate$message_list_release();
        k77[] k77Arr = h04.H0;
        date$message_list_release.c(charSequence, false);
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.G0 && mcf.c(this.V0, this).contains(x, y)) {
            return true;
        }
        t97 t97 = this.S0;
        if (!ek8.L(t97) || !mcf.c((View) t97.getValue(), this).contains(x, y)) {
            return this.L0.contains(x, y);
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v43, types: [android.view.View, xp6] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int X = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
        float f = (float) 4;
        int X2 = a24.X(dh4.c().getDisplayMetrics().density * f);
        boolean L = ek8.L(getSenderNameViewStub$message_list_release().b);
        int i10 = this.Y0;
        if (L) {
            getSenderNameViewStub$message_list_release().c(i10, i10);
            i5 = getSenderBottomMargin$message_list_release() + getSenderNameViewStub$message_list_release().a() + i10;
        } else {
            i5 = i10;
        }
        if (ek8.L((t97) getSenderAliasDelegate().c) && ek8.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().T((getMeasuredWidth() - i10) - getSenderAliasDelegate().L(), ((getSenderNameViewStub$message_list_release().a() / 2) - (getSenderAliasDelegate().K() / 2)) + i10);
        }
        if (ek8.L((t97) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().T(i10, i5);
            i5 += getMessageLinkDelegate().K() + X2;
        }
        pc5 model = getModel();
        int i11 = this.Z0;
        if (model != null && model.m) {
            ts8 messageTextView$message_list_release = getMessageTextView$message_list_release();
            n1g.D(messageTextView$message_list_release, i10, i5, 0, 12);
            i5 += messageTextView$message_list_release.getMeasuredHeight() + i11;
        }
        boolean z2 = this.G0;
        ? r3 = this.V0;
        if (z2) {
            r3.layout(i10, i5, r3.getMeasuredWidth() + i10, r3.getMeasuredHeight() + i5);
        }
        t97 t97 = this.S0;
        if (ek8.L(t97)) {
            ? r4 = (xp6) t97.getValue();
            if (this.G0) {
                i9 = r4.getMeasuredLayoutHeight() != r4.getMeasuredHeight() ? ((r4.getMeasuredLayoutHeight() - r4.getMeasuredHeight()) / 2) + i5 : i5;
                i8 = r4.getMeasuredLayoutWidth() != r4.getMeasuredWidth() ? ((r4.getMeasuredLayoutWidth() - r4.getMeasuredWidth()) / 2) + i10 : i10;
            } else {
                i8 = i10;
                i9 = i5;
            }
            n1g.D(r4, i8, i9, 0, 12);
            if (this.G0) {
                r3.setOutlineProvider(getCornersOutlineProvider());
                r4.setOutlineProvider(getCornersOutlineProvider());
            } else {
                r4.setOutlineProvider(getCornersOutlineProvider());
            }
        }
        t97 t972 = this.R0;
        if (ek8.L(t972)) {
            ImageView imageView = (ImageView) t972.getValue();
            int measuredLayoutWidth = (((xp6) t97.getValue()).getMeasuredLayoutWidth() / 2) + i10;
            int measuredLayoutHeight = (((xp6) t97.getValue()).getMeasuredLayoutHeight() / 2) + i5;
            n1g.C(imageView, measuredLayoutWidth - (imageView.getMeasuredWidth() / 2), measuredLayoutHeight - (imageView.getMeasuredHeight() / 2), (imageView.getMeasuredWidth() / 2) + measuredLayoutWidth, (imageView.getMeasuredHeight() / 2) + measuredLayoutHeight);
        }
        if (ek8.L(t97)) {
            t97 t973 = this.T0;
            if (ek8.L(t973)) {
                c2f c2f = (c2f) t973.getValue();
                n1g.D(c2f, me4.c(f, dh4.c().getDisplayMetrics().density, i10), me4.p(f, dh4.c().getDisplayMetrics().density, (((xp6) t97.getValue()).getMeasuredLayoutHeight() + i5) - c2f.getMeasuredHeight()), 0, 12);
            }
            i5 += ((xp6) t97.getValue()).getMeasuredLayoutHeight() + i11;
        }
        t97 t974 = this.Q0;
        if (ek8.L(t974)) {
            ud5 ud5 = (ud5) t974.getValue();
            if (ek8.L((t97) getReactionsDelegate().c)) {
                if (getMeasuredWidth() - (getReactionsDelegate().L() + (i10 * 2)) < getDate$message_list_release().getMeasuredWidth()) {
                    i7 = me4.c((float) 6, dh4.c().getDisplayMetrics().density, getDate$message_list_release().getMeasuredHeight() + me4.c((float) 10, dh4.c().getDisplayMetrics().density, getReactionsDelegate().K()));
                    n1g.D(ud5, i10, ((((getMeasuredHeight() - i7) - i5) / 2) + i5) - (ud5.getMeasuredHeight() / 2), 0, 12);
                    i6 = getContentHorizontalPadding$message_list_release() + X + i10;
                }
            }
            i7 = ek8.L((t97) getReactionsDelegate().c) ? me4.c((float) 8, dh4.c().getDisplayMetrics().density, me4.c((float) 10, dh4.c().getDisplayMetrics().density, getReactionsDelegate().K())) : i10;
            n1g.D(ud5, i10, ((((getMeasuredHeight() - i7) - i5) / 2) + i5) - (ud5.getMeasuredHeight() / 2), 0, 12);
            i6 = getContentHorizontalPadding$message_list_release() + X + i10;
        } else {
            i6 = i10;
        }
        int X3 = ek8.L(t974) ? a24.X(getActionIconView().getY() + ((float) (getActionIconView().getMeasuredHeight() / 2))) : (X / 2) + i5;
        TextView textView = this.W0;
        n1g.C(textView, i6, X3, textView.getMeasuredWidth() + i6, textView.getMeasuredHeight() + X3);
        Math.max(wx3.n(this.X0), textView.getMeasuredWidth());
        int bottom = ek8.L(t974) ? ((ud5) t974.getValue()).getBottom() : textView.getBottom();
        if (ek8.L((t97) getReactionsDelegate().c)) {
            float f2 = (float) 10;
            getReactionsDelegate().T(a24.X(f2 * dh4.c().getDisplayMetrics().density), me4.c(f2, dh4.c().getDisplayMetrics().density, bottom));
            getReactionsDelegate().K();
        }
        n1g.D(getDate$message_list_release(), (getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth()) - i10, me4.p(f, dh4.c().getDisplayMetrics().density, getMeasuredHeight() - getDate$message_list_release().getMeasuredHeight()), 0, 12);
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v37, types: [android.view.View, xp6] */
    /* JADX WARNING: type inference failed for: r15v3, types: [android.view.View, xp6] */
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        int i4;
        int i5 = i;
        int i6 = i2;
        float f2 = (float) 10;
        int l = rf0.l(f2, dh4.c().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int X = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
        int X2 = a24.X(((float) 44) * dh4.c().getDisplayMetrics().density);
        int X3 = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : getSuggestedMinimumWidth() + getContentHorizontalPadding$message_list_release();
        if (ek8.L((t97) getSenderAliasDelegate().c) && ek8.L(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i6);
            size = Math.max(size, getSenderAliasDelegate().L());
        }
        boolean L = ek8.L(getSenderNameViewStub$message_list_release().b);
        int i7 = this.Y0;
        if (L) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i6);
            int h0 = getSenderAliasDelegate().h0();
            i3 = getSenderBottomMargin$message_list_release() + getSenderNameViewStub$message_list_release().a() + i7;
            size = Math.max(size, (i7 * 2) + getSenderNameViewStub$message_list_release().b() + h0);
        } else {
            i3 = i7;
        }
        pc5 model = getModel();
        int i8 = this.Z0;
        if (model != null && model.m) {
            ts8 messageTextView$message_list_release = getMessageTextView$message_list_release();
            messageTextView$message_list_release.h();
            size = Math.max(size, (i7 * 2) + messageTextView$message_list_release.getMeasuredWidth());
            i3 += messageTextView$message_list_release.getMeasuredHeight() + i8;
        }
        t97 t97 = this.S0;
        boolean L2 = ek8.L(t97);
        ? r14 = this.V0;
        if (L2) {
            ? r15 = (xp6) t97.getValue();
            int i9 = i7 * 2;
            f = f2;
            r15.measure(View.MeasureSpec.makeMeasureSpec(l - i9, 1073741824), i6);
            i3 += r15.getMeasuredLayoutHeight() + i8;
            size = Math.max(size, r15.getMeasuredLayoutWidth() + i9);
            boolean z = (r15.getMeasuredLayoutWidth() == r15.getMeasuredWidth() && r15.getMeasuredLayoutHeight() == r15.getMeasuredHeight()) ? false : true;
            this.G0 = z;
            r14.setVisibility(z ? 0 : 8);
        } else {
            f = f2;
        }
        if (this.G0) {
            r14.measure(View.MeasureSpec.makeMeasureSpec(l - (i7 * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(((xp6) t97.getValue()).getMeasuredLayoutHeight(), 1073741824));
        }
        t97 t972 = this.R0;
        if (t972.a()) {
            ((ImageView) t972.getValue()).measure(View.MeasureSpec.makeMeasureSpec(X2, 1073741824), View.MeasureSpec.makeMeasureSpec(X2, 1073741824));
        }
        boolean L3 = ek8.L(t97);
        t97 t973 = this.Q0;
        if (L3) {
            i4 = Math.min(l, ((xp6) t97.getValue()).getMeasuredWidth());
        } else {
            Integer valueOf = Integer.valueOf(getContentHorizontalPadding$message_list_release() + X);
            if (!ek8.L(t973)) {
                valueOf = 0;
            }
            i4 = (l - valueOf.intValue()) - (i7 * 2);
        }
        if (ek8.L((t97) getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i6);
            size = Math.max(size, (i7 * 2) + getMessageLinkDelegate().L());
            i3 += getMessageLinkDelegate().K() + X3;
        }
        getDate$message_list_release().measure(i5, i6);
        t97 t974 = this.T0;
        if (t974.a()) {
            ((c2f) t974.getValue()).measure(i5, i6);
        }
        if (t973.a()) {
            ((ud5) t973.getValue()).measure(View.MeasureSpec.makeMeasureSpec(X, 1073741824), View.MeasureSpec.makeMeasureSpec(X, 1073741824));
        }
        TextView textView = this.W0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i6);
        int max = Math.max(wx3.n(this.X0), textView.getMeasuredWidth());
        if (!ek8.L(t97)) {
            size = Math.max(size, getContentHorizontalPadding$message_list_release() + (i7 * 2) + max + X);
        }
        int contentHorizontalPadding$message_list_release = (size - i7) - getContentHorizontalPadding$message_list_release();
        Integer valueOf2 = Integer.valueOf(X);
        Integer valueOf3 = Integer.valueOf(textView.getMeasuredHeight() + wx3.m(this.X0));
        if (!ek8.L(t973)) {
            valueOf2 = valueOf3;
        }
        this.L0.set(i7, i3, contentHorizontalPadding$message_list_release, valueOf2.intValue() + i3);
        int measuredHeight = textView.getMeasuredHeight() + wx3.m(this.X0);
        Integer valueOf4 = Integer.valueOf(X);
        Integer valueOf5 = Integer.valueOf(measuredHeight);
        if (!ek8.L(t973)) {
            valueOf4 = valueOf5;
        }
        int max2 = Math.max(valueOf4.intValue(), measuredHeight) + i3;
        if (ek8.L((t97) getReactionsDelegate().c)) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE), i6);
            max2 = rf0.b(f, dh4.c().getDisplayMetrics().density, getReactionsDelegate().K(), max2);
            size = Math.max(size, (i7 * 2) + getReactionsDelegate().L());
        }
        if (ek8.L((t97) getReactionsDelegate().c)) {
            if (size - (getReactionsDelegate().L() + (i7 * 2)) < getDate$message_list_release().getMeasuredWidth()) {
                max2 += me4.c((float) 6, dh4.c().getDisplayMetrics().density, getDate$message_list_release().getMeasuredHeight()) - a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
            }
        }
        int n = wx3.n(this.X0) - textView.getMeasuredWidth();
        if (!ek8.L((t97) getReactionsDelegate().c) && n < getDate$message_list_release().getMeasuredWidth()) {
            size += (a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) + getDate$message_list_release().getMeasuredWidth()) - n;
        }
        if (ek8.L((t97) getReactionsDelegate().c)) {
            i7 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        }
        setMeasuredDimension(size, max2 + i7);
    }

    public void setDateBackgroundColor(int i) {
    }

    public void setDateTextColor(int i) {
        getDate$message_list_release().setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(dcf dcf) {
        getDate$message_list_release().setStatus$message_list_release(dcf);
    }

    public final void setFileInfo(pc5 pc5) {
        q40 q40;
        setModel(pc5);
        this.I0 = new q40(this, 2, pc5);
        if (isAttachedToWindow() && (q40 = this.I0) != null) {
            q40.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.I0);
    }

    public void setSenderName(Layout layout) {
        getSenderNameViewStub$message_list_release().e(layout);
    }

    public void setSenderNameColor(int i) {
        getSenderNameViewStub$message_list_release().f(i);
    }

    public final void w(dr0 dr0) {
        TextPaint paint;
        int i = dr0.a.i;
        er0 er0 = dr0.c;
        this.E0 = er0.f;
        t97 t97 = this.M0;
        boolean a = t97.a();
        s59 s59 = km4.y0;
        if (a) {
            s59.r(this).a().o().c.getClass();
            js.D((Drawable) t97.getValue(), -1);
        }
        t97 t972 = this.O0;
        if (t972.a()) {
            s59.r(this).a().o().c.getClass();
            js.D((Drawable) t972.getValue(), -1);
        }
        Layout layout = this.X0;
        gr0 gr0 = dr0.b;
        if (!(layout == null || (paint = layout.getPaint()) == null)) {
            paint.setColor(gr0.d);
        }
        this.W0.setTextColor(gr0.e);
        t97 t973 = this.Q0;
        if (t973.a()) {
            ((ud5) t973.getValue()).b(dr0);
        }
        t97 t974 = this.R0;
        boolean a2 = t974.a();
        ShapeDrawable shapeDrawable = this.P0;
        if (a2) {
            ImageView imageView = (ImageView) t974.getValue();
            if (imageView.getDrawable() instanceof d00) {
                d00 drawable = imageView.getDrawable();
                d00 d00 = drawable instanceof d00 ? drawable : null;
                if (d00 != null) {
                    d00.b(this.E0);
                }
            } else {
                imageView.setBackground(shapeDrawable);
                imageView.setImageTintList(ColorStateList.valueOf(getPreviewActionIconColor()));
            }
        }
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        getDate$message_list_release().setTextColor$message_list_release(er0.a);
        invalidate();
    }

    public final void x(t97 t97) {
        if (t97.a()) {
            ImageView imageView = (ImageView) t97.getValue();
            pc5 model = getModel();
            int i = 0;
            if ((model != null ? model.j : 0) == 2) {
                Drawable drawable = (Drawable) this.N0.getValue();
                js.D(drawable, getPreviewActionIconColor());
                imageView.setImageDrawable(drawable);
                imageView.setBackground(this.P0);
            }
            pc5 model2 = getModel();
            if ((model2 != null ? model2.j : 0) != 2) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public final void y(t97 t97, float f) {
        Drawable drawable = (Drawable) this.O0.getValue();
        int previewActionIconColor = getPreviewActionIconColor();
        ImageView imageView = (ImageView) t97.getValue();
        if (!(imageView.getDrawable() instanceof d00)) {
            d00 d00 = new d00();
            d00.a = drawable;
            d00.invalidateSelf();
            d00.b(previewActionIconColor);
            d00.e = true;
            d00.invalidateSelf();
            imageView.setImageDrawable(d00);
            imageView.setAdjustViewBounds(false);
        }
        imageView.getDrawable().setLevel((int) (f * ((float) 100)));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public final void z(t97 t97) {
        ImageView imageView = (ImageView) t97.getValue();
        imageView.setAdjustViewBounds(false);
        Drawable drawable = (Drawable) this.M0.getValue();
        js.D(drawable, getPreviewActionIconColor());
        imageView.setImageDrawable(drawable);
        imageView.setBackground(this.P0);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }
}
