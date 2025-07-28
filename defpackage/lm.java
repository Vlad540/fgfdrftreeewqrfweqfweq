package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.a;

/* renamed from: lm  reason: default package */
public class lm extends CheckedTextView implements qt4 {
    public final mm a = new mm(this);
    public final b9 b;
    public final jo c;
    public in o;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x006c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lm(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            defpackage.eke.a(r10)
            r9.<init>(r10, r11, r12)
            android.content.Context r10 = r9.getContext()
            defpackage.vhe.a(r10, r9)
            jo r10 = new jo
            r10.<init>(r9)
            r9.c = r10
            r10.f(r11, r12)
            r10.b()
            b9 r10 = new b9
            r10.<init>((android.view.View) r9)
            r9.b = r10
            r10.F(r11, r12)
            mm r10 = new mm
            r10.<init>(r9)
            r9.a = r10
            android.content.Context r10 = r9.getContext()
            int[] r0 = defpackage.nwb.CheckedTextView
            r1 = 0
            ydc r10 = ydc.D(r10, r11, r0, r12, r1)
            java.lang.Object r0 = r10.c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r3 = r9.getContext()
            int[] r4 = defpackage.nwb.CheckedTextView
            java.util.WeakHashMap r2 = defpackage.eaf.a
            java.lang.Object r2 = r10.c
            r6 = r2
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            r8 = 0
            r2 = r9
            r5 = r11
            r7 = r12
            defpackage.z9f.d(r2, r3, r4, r5, r6, r7, r8)
            int r2 = defpackage.nwb.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x006a }
            boolean r2 = r0.hasValue(r2)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x006c
            int r2 = defpackage.nwb.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x006a }
            int r2 = r0.getResourceId(r2, r1)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x006c
            android.content.Context r3 = r9.getContext()     // Catch:{ NotFoundException -> 0x006c }
            android.graphics.drawable.Drawable r2 = defpackage.am7.n(r3, r2)     // Catch:{ NotFoundException -> 0x006c }
            r9.setCheckMarkDrawable((android.graphics.drawable.Drawable) r2)     // Catch:{ NotFoundException -> 0x006c }
            goto L_0x0087
        L_0x006a:
            r9 = move-exception
            goto L_0x00ba
        L_0x006c:
            int r2 = defpackage.nwb.CheckedTextView_android_checkMark     // Catch:{ all -> 0x006a }
            boolean r2 = r0.hasValue(r2)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0087
            int r2 = defpackage.nwb.CheckedTextView_android_checkMark     // Catch:{ all -> 0x006a }
            int r1 = r0.getResourceId(r2, r1)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0087
            android.content.Context r2 = r9.getContext()     // Catch:{ all -> 0x006a }
            android.graphics.drawable.Drawable r1 = defpackage.am7.n(r2, r1)     // Catch:{ all -> 0x006a }
            r9.setCheckMarkDrawable((android.graphics.drawable.Drawable) r1)     // Catch:{ all -> 0x006a }
        L_0x0087:
            int r1 = defpackage.nwb.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x006a }
            boolean r1 = r0.hasValue(r1)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0098
            int r1 = defpackage.nwb.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x006a }
            android.content.res.ColorStateList r1 = r10.w(r1)     // Catch:{ all -> 0x006a }
            r9.setCheckMarkTintList(r1)     // Catch:{ all -> 0x006a }
        L_0x0098:
            int r1 = defpackage.nwb.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x006a }
            boolean r1 = r0.hasValue(r1)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x00af
            int r1 = defpackage.nwb.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x006a }
            r2 = -1
            int r0 = r0.getInt(r1, r2)     // Catch:{ all -> 0x006a }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = defpackage.bn4.c(r0, r1)     // Catch:{ all -> 0x006a }
            r9.setCheckMarkTintMode(r0)     // Catch:{ all -> 0x006a }
        L_0x00af:
            r10.E()
            in r9 = r9.getEmojiTextViewHelper()
            r9.c(r11, r12)
            return
        L_0x00ba:
            r10.E()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private in getEmojiTextViewHelper() {
        if (this.o == null) {
            this.o = new in(this);
        }
        return this.o;
    }

    public final boolean a() {
        return getEmojiTextViewHelper().b();
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        jo joVar = this.c;
        if (joVar != null) {
            joVar.b();
        }
        b9 b9Var = this.b;
        if (b9Var != null) {
            b9Var.i();
        }
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.b(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        b9 b9Var = this.b;
        if (b9Var != null) {
            return b9Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b9 b9Var = this.b;
        if (b9Var != null) {
            return b9Var.C();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        mm mmVar = this.a;
        if (mmVar != null) {
            return (ColorStateList) mmVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        mm mmVar = this.a;
        if (mmVar != null) {
            return (PorterDuff.Mode) mmVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        x87.r0(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b9 b9Var = this.b;
        if (b9Var != null) {
            b9Var.I();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        b9 b9Var = this.b;
        if (b9Var != null) {
            b9Var.J(i);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        mm mmVar = this.a;
        if (mmVar == null) {
            return;
        }
        if (mmVar.e) {
            mmVar.e = false;
            return;
        }
        mmVar.e = true;
        mmVar.b();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jo joVar = this.c;
        if (joVar != null) {
            joVar.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jo joVar = this.c;
        if (joVar != null) {
            joVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b9 b9Var = this.b;
        if (b9Var != null) {
            b9Var.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b9 b9Var = this.b;
        if (b9Var != null) {
            b9Var.Q(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.a = colorStateList;
            mmVar.c = true;
            mmVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        mm mmVar = this.a;
        if (mmVar != null) {
            mmVar.b = mode;
            mmVar.d = true;
            mmVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        jo joVar = this.c;
        joVar.i(colorStateList);
        joVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        jo joVar = this.c;
        joVar.j(mode);
        joVar.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jo joVar = this.c;
        if (joVar != null) {
            joVar.g(context, i);
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(am7.n(getContext(), i));
    }
}
