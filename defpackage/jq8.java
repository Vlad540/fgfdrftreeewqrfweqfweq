package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: jq8  reason: default package */
public final class jq8 extends LinearLayout implements mhe, rt5 {
    public static final /* synthetic */ k77[] U0;
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final t97 E0;
    public final t97 F0;
    public final t97 G0;
    public final t97 H0;
    public zp8 I0;
    public boolean J0;
    public final yj K0;
    public boolean L0;
    public fq8 M0;
    public final grd N0;
    public final t0c O0;
    public final grd P0;
    public final t0c Q0;
    public final t97 R0;
    public final Rect S0;
    public final ArrayList T0;
    public int a;
    public final ImageView b;
    public final hq8 c;
    public final int o = phc.V0;
    public final t97 w0;
    public final t97 x0;
    public final StateListDrawable y0;
    public final ImageView z0;

    static {
        k77 hc9 = new hc9(jq8.class, "isVideoMessageEnabled", "isVideoMessageEnabled()Z");
        m7c.a.getClass();
        U0 = new k77[]{hc9};
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.widget.TextView, android.view.View, android.widget.EditText, hq8] */
    /* JADX WARNING: type inference failed for: r15v18, types: [java.lang.Object, fq8] */
    public jq8(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        float f = (float) 4;
        this.a = a24.X(dh4.c().getDisplayMetrics().density * f);
        ImageView imageView = new ImageView(context);
        imageView.setId(qhc.R);
        s59 s59 = km4.y0;
        imageView.setImageTintList(ColorStateList.valueOf(s59.r(imageView).a().d().c.c));
        float f2 = (float) 28;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        layoutParams.setMargins(a24.X(f * dh4.c().getDisplayMetrics().density), layoutParams.topMargin, layoutParams.rightMargin, this.a);
        imageView.setLayoutParams(layoutParams);
        this.b = imageView;
        ? editText = new EditText(context);
        editText.setId(qhc.Q);
        editText.setBackground((Drawable) null);
        editText.setPadding(0, 0, 0, 0);
        editText.setMaxLines(8);
        jp2.l.b(editText, yq4.b);
        editText.setInputType(editText.getInputType() | 16384);
        editText.setImeOptions(268435456);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 16;
        float f3 = (float) 6;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f3);
        layoutParams2.setMargins(X, X, X, X);
        editText.setLayoutParams(layoutParams2);
        GestureDetector gestureDetector = new GestureDetector(context, new tz(13, this));
        gestureDetector.setIsLongpressEnabled(true);
        editText.setOnTouchListener(new cg3(gestureDetector, 5));
        fja.d(editText);
        this.c = editText;
        this.w0 = ez3.O(3, new zu4((Object) context, 15, (Object) this));
        this.x0 = ez3.O(3, new cc3(context, 15));
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(100.0f);
        stateListDrawable.addState(new int[]{16842910}, gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(100.0f);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
        this.y0 = stateListDrawable;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(qhc.U);
        float f4 = (float) 36;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f4 * dh4.c().getDisplayMetrics().density));
        layoutParams3.gravity = 80;
        layoutParams3.setMarginStart(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
        imageView2.setLayoutParams(layoutParams3);
        this.z0 = imageView2;
        this.A0 = ez3.O(3, new cc3(context, 16));
        this.B0 = ez3.O(3, new wp8(this, 2));
        this.C0 = ez3.O(3, new wp8(this, 3));
        this.D0 = ez3.O(3, new wp8(this, 4));
        this.E0 = ez3.O(3, new wp8(this, 5));
        this.F0 = ez3.O(3, new wp8(this, 6));
        this.G0 = ez3.O(3, new wp8(this, 0));
        this.H0 = ez3.O(3, new wp8(this, 1));
        this.I0 = zp8.a;
        this.K0 = new yj(this);
        this.M0 = new Object();
        grd a2 = hrd.a((Object) null);
        this.N0 = a2;
        this.O0 = new t0c(a2);
        grd a3 = hrd.a(0);
        this.P0 = a3;
        this.Q0 = new t0c(a3);
        this.R0 = ez3.O(3, new ib7(26));
        this.S0 = new Rect();
        this.T0 = new ArrayList();
        setId(qhc.W);
        setClipChildren(false);
        setClipToPadding(false);
        int X2 = a24.X(f3 * dh4.c().getDisplayMetrics().density);
        setPadding(X2, X2, X2, X2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        setLayoutParams(layoutParams4);
        addView(imageView);
        addView(editText);
        addView(imageView2);
        imageView.setImageResource(phc.Z0);
        editText.setAccessibilityDelegate(new wv6(1, this));
        editText.addTextChangedListener(new jv4(1, this));
        onThemeChanged(s59.r(this));
    }

    public static LayerDrawable b(jq8 jq8) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jq8.y0, jq8.getCheckDrawable()});
        float f = (float) 4;
        layerDrawable.setLayerInset(1, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        return layerDrawable;
    }

    public static LayerDrawable c(jq8 jq8) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jq8.y0, jq8.getArrowDrawable()});
        float f = (float) 4;
        layerDrawable.setLayerInset(1, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        return layerDrawable;
    }

    private final Drawable getArrowDrawable() {
        return (Drawable) this.B0.getValue();
    }

    private final Drawable getCheckDrawable() {
        return (Drawable) this.D0.getValue();
    }

    private final LayerDrawable getCheckIcon() {
        return (LayerDrawable) this.E0.getValue();
    }

    private final Drawable getEmojiArrowDownDrawable() {
        return (Drawable) this.H0.getValue();
    }

    private final Drawable getEmojiArrowUpDrawable() {
        return (Drawable) this.G0.getValue();
    }

    private final InputFilter getEmptyFilter() {
        return (InputFilter) this.R0.getValue();
    }

    private final Drawable getMicIcon() {
        return (Drawable) this.F0.getValue();
    }

    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.C0.getValue();
    }

    private final void setSendActionState(fq8 fq8) {
        this.M0 = fq8;
        k(km4.y0.r(this));
    }

    /* access modifiers changed from: private */
    public final void setVideoMsgButtonVisible(boolean z) {
        t97 t97 = this.A0;
        ImageView imageView = this.z0;
        if (z) {
            jjd.f(this, (View) t97.getValue(), Integer.valueOf(indexOfChild(imageView)));
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(a24.X(((float) 6) * dh4.c().getDisplayMetrics().density));
                imageView.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } else if (t97.a()) {
            removeView((ImageView) t97.getValue());
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
                imageView.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void a(yq4 yq4) {
        addOnLayoutChangeListener(new zm1(this, 2, yq4));
    }

    public final void e(boolean z) {
        this.L0 = z;
        hq8 hq8 = this.c;
        if (z) {
            bm3.H(hq8);
        } else {
            bm3.r(hq8);
        }
    }

    public final void f(CharSequence charSequence) {
        hq8 hq8 = this.c;
        Editable text = hq8.getText();
        if (text == null || charSequence == null) {
            setText(charSequence);
            return;
        }
        int selectionStart = hq8.getSelectionStart();
        int selectionEnd = hq8.getSelectionEnd();
        int max = Math.max(selectionStart, 0);
        int max2 = Math.max(selectionEnd, 0);
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        if (selectionStart == -1 && selectionEnd == -1) {
            text.append(charSequence);
            return;
        }
        text.replace(min, max3, charSequence, 0, charSequence.length());
    }

    public final boolean g() {
        Editable text = this.c.getText();
        return text == null || h0e.c0(text);
    }

    public final View getAudioRecordAnchor() {
        return this.z0;
    }

    public final int getCursorPosition() {
        return this.c.getSelectionEnd();
    }

    public final zp8 getEmojiExpandableState() {
        return this.I0;
    }

    public final zqd getMessagePosition() {
        return this.Q0;
    }

    public final zqd getMessageState() {
        return this.O0;
    }

    public final fq8 getSendActionState() {
        return this.M0;
    }

    public final CharSequence getText() {
        Editable text = this.c.getText();
        if (text != null) {
            return text.subSequence(0, text.length());
        }
        return null;
    }

    public final View getVideoMessageRecordAnchor() {
        t97 t97 = this.A0;
        if (ek8.L(t97)) {
            return (View) t97.getValue();
        }
        return null;
    }

    public final void h(int i) {
        if (i != -1) {
            hq8 hq8 = this.c;
            hq8.setSelection(Math.min(i, hq8.length()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (h0e.R(r1, "\n", false) == true) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r5 = this;
            t97 r0 = r5.x0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            hq8 r1 = r5.c
            android.text.Editable r1 = r1.getText()
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.String r3 = "\n"
            boolean r1 = h0e.R(r1, r3, r2)
            r3 = 1
            if (r1 != r3) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            boolean r1 = r5.g()
            hqd r4 = defpackage.hqd.b
            if (r1 == 0) goto L_0x0048
            boolean r1 = r5.J0
            if (r1 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x002c
            goto L_0x0048
        L_0x002c:
            boolean r1 = r5.L0
            if (r1 == 0) goto L_0x003c
            r5.L0 = r2
            java.lang.Object r5 = r0.getValue()
            jqd r5 = (defpackage.jqd) r5
            r5.setExpandableState(r4)
            goto L_0x0051
        L_0x003c:
            java.lang.Object r5 = r0.getValue()
            jqd r5 = (defpackage.jqd) r5
            hqd r0 = defpackage.hqd.a
            r5.setExpandableState(r0)
            goto L_0x0051
        L_0x0048:
            java.lang.Object r5 = r0.getValue()
            jqd r5 = (defpackage.jqd) r5
            r5.setExpandableState(r4)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.i():void");
    }

    public final void j() {
        t97 t97 = this.w0;
        if (t97.a()) {
            ImageView imageView = (ImageView) t97.getValue();
            imageView.setImageTintList(ColorStateList.valueOf(km4.y0.r(imageView).a().d().c.c));
        }
    }

    public final void k(pda pda) {
        zp8 zp8;
        fq8 fq8 = this.M0;
        boolean g = g();
        eq8 eq8 = eq8.a;
        ImageView imageView = this.z0;
        if (!g || !hhd.f(fq8, eq8)) {
            boolean f = hhd.f(fq8, dq8.a);
            StateListDrawable stateListDrawable = this.y0;
            if (f || hhd.f(fq8, eq8)) {
                stateListDrawable.setState(new int[]{16842910});
                imageView.setPadding(0, 0, 0, 0);
                Drawable checkDrawable = getCheckDrawable();
                pda.getIcon();
                js.D(checkDrawable, -1);
                imageView.setImageDrawable(getCheckIcon());
                imageView.setEnabled(true);
                setVideoMsgButtonVisible(false);
            } else {
                boolean g2 = g();
                s59 s59 = km4.y0;
                if (g2 && (zp8 = this.I0) != zp8.a) {
                    Drawable emojiArrowDownDrawable = zp8 == zp8.b ? getEmojiArrowDownDrawable() : getEmojiArrowUpDrawable();
                    imageView.setImageDrawable(emojiArrowDownDrawable);
                    js.D(emojiArrowDownDrawable, s59.r(this).a().d().c.c);
                    setVideoMsgButtonVisible(false);
                } else if (!g() || !(fq8 instanceof bq8)) {
                    if (imageView.getDrawable() != getSendIcon()) {
                        stateListDrawable.setState(new int[]{16842910});
                        imageView.setImageDrawable(getSendIcon());
                        imageView.setPadding(0, 0, 0, 0);
                        imageView.setEnabled(true);
                    }
                    Drawable arrowDrawable = getArrowDrawable();
                    pda.getIcon();
                    js.D(arrowDrawable, -1);
                    setVideoMsgButtonVisible(false);
                } else {
                    ((bq8) fq8).getClass();
                    if (gq8.$EnumSwitchMapping$0[hr1.t(1)] == 1) {
                        js.D(getMicIcon(), s59.r(this).a().d().c.c);
                        if (imageView.getDrawable() != getMicIcon()) {
                            imageView.setImageDrawable(getMicIcon());
                            imageView.setEnabled(true);
                            me4.o((float) 4, dh4.c().getDisplayMetrics().density, imageView);
                            t97 t97 = this.A0;
                            if (t97.a()) {
                                ImageView imageView2 = (ImageView) t97.getValue();
                                k77 k77 = U0[0];
                                setVideoMsgButtonVisible(((Boolean) this.K0.b).booleanValue());
                            }
                        } else {
                            return;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        } else {
            js.D(getCheckDrawable(), pda.c().b.b);
            imageView.setPadding(0, 0, 0, 0);
            imageView.setImageDrawable(getCheckIcon());
            imageView.setEnabled(false);
            setVideoMsgButtonVisible(false);
        }
        i();
        imageView.invalidate();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        String[] d = eaf.d(this);
        if (d == null || editorInfo == null) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = d;
        return new gx6(onCreateInputConnection, new hy5(6, this));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            ArrayList arrayList = this.T0;
            arrayList.clear();
            ImageView imageView = this.z0;
            float f = (float) 12;
            int c2 = me4.c(f, dh4.c().getDisplayMetrics().density, imageView.getLeft());
            int c3 = me4.c(f, dh4.c().getDisplayMetrics().density, imageView.getTop());
            int c4 = me4.c(f, dh4.c().getDisplayMetrics().density, imageView.getRight());
            int c5 = me4.c(f, dh4.c().getDisplayMetrics().density, imageView.getBottom());
            Rect rect = this.S0;
            rect.set(c2, c3, c4, c5);
            arrayList.add(rect);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        TouchDelegate touchDelegate = getTouchDelegate();
        z83 z83 = touchDelegate instanceof z83 ? (z83) touchDelegate : null;
        if (z83 != null) {
            z83.a.clear();
        }
        float f = (float) 10;
        mt0.b(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f), this, this.b);
        float f2 = (float) 12;
        mt0.b(0, a24.X(dh4.c().getDisplayMetrics().density * f2), 0, a24.X(f2 * dh4.c().getDisplayMetrics().density), this, this.c);
        float f3 = (float) 6;
        mt0.b(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), this, this.z0);
        t97 t97 = this.w0;
        if (t97.a()) {
            mt0.b(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f * dh4.c().getDisplayMetrics().density), this, (ImageView) t97.getValue());
        }
        t97 t972 = this.A0;
        if (t972.a()) {
            mt0.b(a24.X(f3 * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), this, (ImageView) t972.getValue());
        }
    }

    public final void onThemeChanged(pda pda) {
        s59 s59 = km4.y0;
        setBackgroundColor(s59.r(this).a().d().a.a);
        this.b.setImageTintList(ColorStateList.valueOf(s59.r(this).a().d().c.c));
        cfe text = pda.getText();
        hq8 hq8 = this.c;
        hq8.setTextColor(text.e);
        hq8.setHintTextColor(n1g.c0(pda.getText().h, 0.4f));
        hq8.setHighlightColor(-16745729);
        Drawable textCursorDrawable = hq8.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        }
        Editable text2 = hq8.getText();
        if (text2 != null) {
            for (Object obj : text2.getSpans(0, text2.length(), Object.class)) {
                if (obj instanceof ip8) {
                    ((ip8) obj).b = s59.r(hq8).a().a(true).b.b;
                } else if (obj instanceof mhe) {
                    ((mhe) obj).onThemeChanged(pda);
                }
            }
        }
        StateListDrawable stateListDrawable = this.y0;
        pda.b().a.getClass();
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{16842910}))).setColor(-16745729);
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{-16842910}))).setColor(pda.c().a.r);
        k(pda);
        j();
        invalidate();
    }

    public final void setCustomSelectionActionModeCallback(u16 u16) {
        hq8 hq8 = this.c;
        hq8.setCustomSelectionActionModeCallback((ActionMode.Callback) u16.invoke(hq8));
    }

    public final void setEmojiExpandableState(zp8 zp8) {
        this.I0 = zp8;
        k(km4.y0.r(this));
    }

    public final void setInputEnabled(boolean z) {
        hq8 hq8 = this.c;
        if (z) {
            hq8.setFilters(new InputFilter[0]);
            return;
        }
        hq8.setFilters(new InputFilter[]{getEmptyFilter()});
    }

    public final void setInputHint(CharSequence charSequence) {
        this.c.setHint(charSequence);
    }

    public final void setInputKeyListener(View.OnKeyListener onKeyListener) {
        this.c.setOnKeyListener(onKeyListener);
    }

    public final void setKeyboardVisible(boolean z) {
        this.J0 = z;
        i();
    }

    public final void setLeftIcon(int i) {
        this.b.setImageResource(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setLeftInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        this.b.setOnTouchListener(onTouchListener);
    }

    public final void setLeftOuterIconOnClickListener(s16 s16) {
        a24.a0((View) this.x0.getValue(), new q6(15, s16));
    }

    public final void setLeftOuterIconText(CharSequence charSequence) {
        t97 t97 = this.x0;
        jjd.f(this, (View) t97.getValue(), 0);
        ((jqd) t97.getValue()).setText(charSequence);
    }

    public final void setLeftOuterIconVisible(boolean z) {
        t97 t97 = this.x0;
        if (z) {
            jjd.f(this, (View) t97.getValue(), 0);
        } else if (t97.a()) {
            removeView((View) t97.getValue());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setRightInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        t97 t97 = this.w0;
        if (onTouchListener != null) {
            ((ImageView) t97.getValue()).setOnTouchListener(onTouchListener);
        } else if (t97.a()) {
            ((ImageView) t97.getValue()).setOnTouchListener((View.OnTouchListener) null);
        }
    }

    public final void setRightInnerIconVisible(boolean z) {
        t97 t97 = this.w0;
        if (z) {
            jjd.f(this, (View) t97.getValue(), Integer.valueOf(indexOfChild(this.c) + 1));
            j();
        } else if (t97.a()) {
            removeView((View) t97.getValue());
        }
    }

    public final void setRightOuterIconActionState(fq8 fq8) {
        setSendActionState(fq8);
    }

    public final void setRightOuterIconEnabled(boolean z) {
        this.z0.setEnabled(z);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setRightOuterIconTouchListener(View.OnTouchListener onTouchListener) {
        this.z0.setOnTouchListener(onTouchListener);
    }

    public final void setText(CharSequence charSequence) {
        hq8 hq8 = this.c;
        if (charSequence == null) {
            Editable text = hq8.getText();
            if (text != null) {
                text.clear();
                return;
            }
            return;
        }
        hq8.setText(charSequence);
    }

    public final void setVideoMessageEnabled(boolean z) {
        this.K0.o1(this, U0[0], Boolean.valueOf(z));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setVideoMessageTouchListener(View.OnTouchListener onTouchListener) {
        t97 t97 = this.A0;
        if (onTouchListener != null) {
            ((ImageView) t97.getValue()).setOnTouchListener(onTouchListener);
        } else if (t97.a()) {
            ((ImageView) t97.getValue()).setOnTouchListener((View.OnTouchListener) null);
        }
    }

    public final void setInputHint(int i) {
        this.c.setHint(i);
    }
}
