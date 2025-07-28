package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: jo  reason: default package */
public final class jo {
    public final TextView a;
    public od3 b;
    public od3 c;
    public od3 d;
    public od3 e;
    public od3 f;
    public od3 g;
    public od3 h;
    public final qo i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public jo(TextView textView) {
        this.a = textView;
        this.i = new qo(textView);
    }

    public static od3 c(Context context, gn gnVar, int i2) {
        ColorStateList h2;
        synchronized (gnVar) {
            h2 = gnVar.a.h(context, i2);
        }
        if (h2 == null) {
            return null;
        }
        od3 od3 = new od3(2);
        od3.c = true;
        od3.d = h2;
        return od3;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i2 >= 30) {
                br3.c(editorInfo, text);
                return;
            }
            text.getClass();
            if (i2 >= 30) {
                br3.c(editorInfo, text);
                return;
            }
            int i3 = editorInfo.initialSelStart;
            int i4 = editorInfo.initialSelEnd;
            int i5 = i3 > i4 ? i4 : i3;
            if (i3 <= i4) {
                i3 = i4;
            }
            int length = text.length();
            if (i5 < 0 || i3 > length) {
                vx3.J(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i6 = editorInfo.inputType & 4095;
            if (i6 == 129 || i6 == 225 || i6 == 18) {
                vx3.J(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                vx3.J(editorInfo, text, i5, i3);
            } else {
                int i7 = i3 - i5;
                int i8 = i7 > 1024 ? 0 : i7;
                int i9 = 2048 - i8;
                int min = Math.min(text.length() - i3, i9 - Math.min(i5, (int) (((double) i9) * 0.8d)));
                int min2 = Math.min(i5, i9 - min);
                int i10 = i5 - min2;
                if (Character.isLowSurrogate(text.charAt(i10))) {
                    i10++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i3 + min) - 1))) {
                    min--;
                }
                int i11 = min2 + i8;
                vx3.J(editorInfo, i8 != i7 ? TextUtils.concat(new CharSequence[]{text.subSequence(i10, i10 + min2), text.subSequence(i3, min + i3)}) : text.subSequence(i10, i11 + min + i10), min2, i11);
            }
        }
    }

    public final void a(Drawable drawable, od3 od3) {
        if (drawable != null && od3 != null) {
            gn.e(drawable, od3, this.a.getDrawableState());
        }
    }

    public final void b() {
        od3 od3 = this.b;
        TextView textView = this.a;
        if (!(od3 == null && this.c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public final ColorStateList d() {
        od3 od3 = this.h;
        if (od3 != null) {
            return (ColorStateList) od3.d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        od3 od3 = this.h;
        if (od3 != null) {
            return (PorterDuff.Mode) od3.e;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:202:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r8 = r20
            r9 = r21
            android.widget.TextView r11 = r0.a
            android.content.Context r12 = r11.getContext()
            gn r13 = defpackage.gn.a()
            int[] r1 = defpackage.nwb.AppCompatTextHelper
            r14 = 0
            ydc r15 = ydc.D(r12, r8, r1, r9, r14)
            android.content.Context r2 = r11.getContext()
            int[] r3 = defpackage.nwb.AppCompatTextHelper
            java.util.WeakHashMap r1 = defpackage.eaf.a
            java.lang.Object r1 = r15.c
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r7 = 0
            r1 = r11
            r4 = r20
            r6 = r21
            defpackage.z9f.d(r1, r2, r3, r4, r5, r6, r7)
            int r1 = defpackage.nwb.AppCompatTextHelper_android_textAppearance
            java.lang.Object r2 = r15.c
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2
            r7 = -1
            int r1 = r2.getResourceId(r1, r7)
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableLeft
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x004c
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableLeft
            int r3 = r2.getResourceId(r3, r14)
            od3 r3 = c(r12, r13, r3)
            r0.b = r3
        L_0x004c:
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableTop
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x0060
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableTop
            int r3 = r2.getResourceId(r3, r14)
            od3 r3 = c(r12, r13, r3)
            r0.c = r3
        L_0x0060:
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableRight
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x0074
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableRight
            int r3 = r2.getResourceId(r3, r14)
            od3 r3 = c(r12, r13, r3)
            r0.d = r3
        L_0x0074:
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableBottom
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x0088
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableBottom
            int r3 = r2.getResourceId(r3, r14)
            od3 r3 = c(r12, r13, r3)
            r0.e = r3
        L_0x0088:
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableStart
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x009c
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableStart
            int r3 = r2.getResourceId(r3, r14)
            od3 r3 = c(r12, r13, r3)
            r0.f = r3
        L_0x009c:
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L_0x00b0
            int r3 = defpackage.nwb.AppCompatTextHelper_android_drawableEnd
            int r2 = r2.getResourceId(r3, r14)
            od3 r2 = c(r12, r13, r2)
            r0.g = r2
        L_0x00b0:
            r15.E()
            android.text.method.TransformationMethod r2 = r11.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            if (r1 == r7) goto L_0x0101
            int[] r3 = defpackage.nwb.TextAppearance
            ydc r4 = new ydc
            android.content.res.TypedArray r1 = r12.obtainStyledAttributes(r1, r3)
            r4.<init>(r12, r1)
            if (r2 != 0) goto L_0x00d8
            int r3 = defpackage.nwb.TextAppearance_textAllCaps
            boolean r3 = r1.hasValue(r3)
            if (r3 == 0) goto L_0x00d8
            int r3 = defpackage.nwb.TextAppearance_textAllCaps
            boolean r3 = r1.getBoolean(r3, r14)
            r5 = 1
            goto L_0x00da
        L_0x00d8:
            r3 = r14
            r5 = r3
        L_0x00da:
            r0.k(r4, r12)
            int r6 = defpackage.nwb.TextAppearance_textLocale
            boolean r6 = r1.hasValue(r6)
            if (r6 == 0) goto L_0x00ec
            int r6 = defpackage.nwb.TextAppearance_textLocale
            java.lang.String r6 = r1.getString(r6)
            goto L_0x00ed
        L_0x00ec:
            r6 = 0
        L_0x00ed:
            int r15 = defpackage.nwb.TextAppearance_fontVariationSettings
            boolean r15 = r1.hasValue(r15)
            if (r15 == 0) goto L_0x00fc
            int r15 = defpackage.nwb.TextAppearance_fontVariationSettings
            java.lang.String r1 = r1.getString(r15)
            goto L_0x00fd
        L_0x00fc:
            r1 = 0
        L_0x00fd:
            r4.E()
            goto L_0x0105
        L_0x0101:
            r3 = r14
            r5 = r3
            r1 = 0
            r6 = 0
        L_0x0105:
            int[] r4 = defpackage.nwb.TextAppearance
            ydc r15 = new ydc
            android.content.res.TypedArray r4 = r12.obtainStyledAttributes(r8, r4, r9, r14)
            r15.<init>(r12, r4)
            if (r2 != 0) goto L_0x0121
            int r10 = defpackage.nwb.TextAppearance_textAllCaps
            boolean r10 = r4.hasValue(r10)
            if (r10 == 0) goto L_0x0121
            int r3 = defpackage.nwb.TextAppearance_textAllCaps
            boolean r3 = r4.getBoolean(r3, r14)
            r5 = 1
        L_0x0121:
            int r10 = defpackage.nwb.TextAppearance_textLocale
            boolean r10 = r4.hasValue(r10)
            if (r10 == 0) goto L_0x012f
            int r6 = defpackage.nwb.TextAppearance_textLocale
            java.lang.String r6 = r4.getString(r6)
        L_0x012f:
            int r10 = defpackage.nwb.TextAppearance_fontVariationSettings
            boolean r10 = r4.hasValue(r10)
            if (r10 == 0) goto L_0x013d
            int r1 = defpackage.nwb.TextAppearance_fontVariationSettings
            java.lang.String r1 = r4.getString(r1)
        L_0x013d:
            int r10 = defpackage.nwb.TextAppearance_android_textSize
            boolean r10 = r4.hasValue(r10)
            if (r10 == 0) goto L_0x0151
            int r10 = defpackage.nwb.TextAppearance_android_textSize
            int r4 = r4.getDimensionPixelSize(r10, r7)
            if (r4 != 0) goto L_0x0151
            r4 = 0
            r11.setTextSize(r14, r4)
        L_0x0151:
            r0.k(r15, r12)
            r15.E()
            if (r2 != 0) goto L_0x015e
            if (r5 == 0) goto L_0x015e
            r11.setAllCaps(r3)
        L_0x015e:
            android.graphics.Typeface r2 = r0.l
            if (r2 == 0) goto L_0x016f
            int r3 = r0.k
            if (r3 != r7) goto L_0x016c
            int r3 = r0.j
            r11.setTypeface(r2, r3)
            goto L_0x016f
        L_0x016c:
            r11.setTypeface(r2)
        L_0x016f:
            if (r1 == 0) goto L_0x0174
            defpackage.ho.d(r11, r1)
        L_0x0174:
            if (r6 == 0) goto L_0x017d
            android.os.LocaleList r1 = defpackage.go.a(r6)
            defpackage.go.b(r11, r1)
        L_0x017d:
            int[] r1 = defpackage.nwb.AppCompatTextView
            qo r10 = r0.i
            android.content.Context r15 = r10.i
            android.content.res.TypedArray r6 = r15.obtainStyledAttributes(r8, r1, r9, r14)
            android.widget.TextView r0 = r10.h
            android.content.Context r1 = r0.getContext()
            int[] r2 = defpackage.nwb.AppCompatTextView
            r17 = 0
            r3 = r20
            r4 = r6
            r5 = r21
            r9 = r6
            r6 = r17
            defpackage.z9f.d(r0, r1, r2, r3, r4, r5, r6)
            int r0 = defpackage.nwb.AppCompatTextView_autoSizeTextType
            boolean r0 = r9.hasValue(r0)
            if (r0 == 0) goto L_0x01ac
            int r0 = defpackage.nwb.AppCompatTextView_autoSizeTextType
            int r0 = r9.getInt(r0, r14)
            r10.a = r0
        L_0x01ac:
            int r0 = defpackage.nwb.AppCompatTextView_autoSizeStepGranularity
            boolean r0 = r9.hasValue(r0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x01bd
            int r0 = defpackage.nwb.AppCompatTextView_autoSizeStepGranularity
            float r0 = r9.getDimension(r0, r1)
            goto L_0x01be
        L_0x01bd:
            r0 = r1
        L_0x01be:
            int r2 = defpackage.nwb.AppCompatTextView_autoSizeMinTextSize
            boolean r2 = r9.hasValue(r2)
            if (r2 == 0) goto L_0x01cd
            int r2 = defpackage.nwb.AppCompatTextView_autoSizeMinTextSize
            float r2 = r9.getDimension(r2, r1)
            goto L_0x01ce
        L_0x01cd:
            r2 = r1
        L_0x01ce:
            int r3 = defpackage.nwb.AppCompatTextView_autoSizeMaxTextSize
            boolean r3 = r9.hasValue(r3)
            if (r3 == 0) goto L_0x01dd
            int r3 = defpackage.nwb.AppCompatTextView_autoSizeMaxTextSize
            float r3 = r9.getDimension(r3, r1)
            goto L_0x01de
        L_0x01dd:
            r3 = r1
        L_0x01de:
            int r4 = defpackage.nwb.AppCompatTextView_autoSizePresetSizes
            boolean r4 = r9.hasValue(r4)
            if (r4 == 0) goto L_0x0217
            int r4 = defpackage.nwb.AppCompatTextView_autoSizePresetSizes
            int r4 = r9.getResourceId(r4, r14)
            if (r4 <= 0) goto L_0x0217
            android.content.res.Resources r5 = r9.getResources()
            android.content.res.TypedArray r4 = r5.obtainTypedArray(r4)
            int r5 = r4.length()
            int[] r6 = new int[r5]
            if (r5 <= 0) goto L_0x0214
        L_0x01fe:
            if (r14 >= r5) goto L_0x020b
            int r18 = r4.getDimensionPixelSize(r14, r7)
            r6[r14] = r18
            r16 = 1
            int r14 = r14 + 1
            goto L_0x01fe
        L_0x020b:
            int[] r5 = defpackage.qo.a(r6)
            r10.f = r5
            r10.c()
        L_0x0214:
            r4.recycle()
        L_0x0217:
            r9.recycle()
            boolean r4 = r10.d()
            r5 = 2
            if (r4 == 0) goto L_0x0253
            int r4 = r10.a
            r6 = 1
            if (r4 != r6) goto L_0x0256
            boolean r4 = r10.g
            if (r4 != 0) goto L_0x024f
            android.content.res.Resources r4 = r15.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r6 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x023c
            r2 = 1094713344(0x41400000, float:12.0)
            float r2 = android.util.TypedValue.applyDimension(r5, r2, r4)
        L_0x023c:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0246
            r3 = 1121976320(0x42e00000, float:112.0)
            float r3 = android.util.TypedValue.applyDimension(r5, r3, r4)
        L_0x0246:
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x024c
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x024c:
            r10.e(r2, r3, r0)
        L_0x024f:
            r10.b()
            goto L_0x0256
        L_0x0253:
            r0 = 0
            r10.a = r0
        L_0x0256:
            int r0 = r10.a
            if (r0 == 0) goto L_0x0283
            int[] r0 = r10.f
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0283
            int r2 = defpackage.ho.a(r11)
            float r2 = (float) r2
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x027f
            float r0 = r10.d
            int r0 = java.lang.Math.round(r0)
            float r2 = r10.e
            int r2 = java.lang.Math.round(r2)
            float r3 = r10.c
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            defpackage.ho.b(r11, r0, r2, r3, r4)
            goto L_0x0283
        L_0x027f:
            r4 = 0
            defpackage.ho.c(r11, r0, r4)
        L_0x0283:
            int[] r0 = defpackage.nwb.AppCompatTextView
            android.content.res.TypedArray r0 = r12.obtainStyledAttributes(r8, r0)
            int r2 = defpackage.nwb.AppCompatTextView_drawableLeftCompat
            int r2 = r0.getResourceId(r2, r7)
            if (r2 == r7) goto L_0x0296
            android.graphics.drawable.Drawable r2 = r13.b(r12, r2)
            goto L_0x0297
        L_0x0296:
            r2 = 0
        L_0x0297:
            int r3 = defpackage.nwb.AppCompatTextView_drawableTopCompat
            int r3 = r0.getResourceId(r3, r7)
            if (r3 == r7) goto L_0x02a4
            android.graphics.drawable.Drawable r3 = r13.b(r12, r3)
            goto L_0x02a5
        L_0x02a4:
            r3 = 0
        L_0x02a5:
            int r4 = defpackage.nwb.AppCompatTextView_drawableRightCompat
            int r4 = r0.getResourceId(r4, r7)
            if (r4 == r7) goto L_0x02b2
            android.graphics.drawable.Drawable r4 = r13.b(r12, r4)
            goto L_0x02b3
        L_0x02b2:
            r4 = 0
        L_0x02b3:
            int r6 = defpackage.nwb.AppCompatTextView_drawableBottomCompat
            int r6 = r0.getResourceId(r6, r7)
            if (r6 == r7) goto L_0x02c0
            android.graphics.drawable.Drawable r6 = r13.b(r12, r6)
            goto L_0x02c1
        L_0x02c0:
            r6 = 0
        L_0x02c1:
            int r8 = defpackage.nwb.AppCompatTextView_drawableStartCompat
            int r8 = r0.getResourceId(r8, r7)
            if (r8 == r7) goto L_0x02ce
            android.graphics.drawable.Drawable r8 = r13.b(r12, r8)
            goto L_0x02cf
        L_0x02ce:
            r8 = 0
        L_0x02cf:
            int r9 = defpackage.nwb.AppCompatTextView_drawableEndCompat
            int r9 = r0.getResourceId(r9, r7)
            if (r9 == r7) goto L_0x02dc
            android.graphics.drawable.Drawable r9 = r13.b(r12, r9)
            goto L_0x02dd
        L_0x02dc:
            r9 = 0
        L_0x02dd:
            r10 = 3
            if (r8 != 0) goto L_0x0327
            if (r9 == 0) goto L_0x02e3
            goto L_0x0327
        L_0x02e3:
            if (r2 != 0) goto L_0x02eb
            if (r3 != 0) goto L_0x02eb
            if (r4 != 0) goto L_0x02eb
            if (r6 == 0) goto L_0x0344
        L_0x02eb:
            android.graphics.drawable.Drawable[] r8 = r11.getCompoundDrawablesRelative()
            r9 = 0
            r13 = r8[r9]
            if (r13 != 0) goto L_0x0316
            r14 = r8[r5]
            if (r14 == 0) goto L_0x02f9
            goto L_0x0316
        L_0x02f9:
            android.graphics.drawable.Drawable[] r8 = r11.getCompoundDrawables()
            if (r2 == 0) goto L_0x0300
            goto L_0x0302
        L_0x0300:
            r2 = r8[r9]
        L_0x0302:
            if (r3 == 0) goto L_0x0305
            goto L_0x0308
        L_0x0305:
            r3 = 1
            r3 = r8[r3]
        L_0x0308:
            if (r4 == 0) goto L_0x030b
            goto L_0x030d
        L_0x030b:
            r4 = r8[r5]
        L_0x030d:
            if (r6 == 0) goto L_0x0310
            goto L_0x0312
        L_0x0310:
            r6 = r8[r10]
        L_0x0312:
            r11.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r4, r6)
            goto L_0x0344
        L_0x0316:
            if (r3 == 0) goto L_0x0319
            goto L_0x031c
        L_0x0319:
            r2 = 1
            r3 = r8[r2]
        L_0x031c:
            if (r6 == 0) goto L_0x031f
            goto L_0x0321
        L_0x031f:
            r6 = r8[r10]
        L_0x0321:
            r2 = r8[r5]
            r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r13, r3, r2, r6)
            goto L_0x0344
        L_0x0327:
            android.graphics.drawable.Drawable[] r2 = r11.getCompoundDrawablesRelative()
            if (r8 == 0) goto L_0x032e
            goto L_0x0331
        L_0x032e:
            r4 = 0
            r8 = r2[r4]
        L_0x0331:
            if (r3 == 0) goto L_0x0334
            goto L_0x0337
        L_0x0334:
            r3 = 1
            r3 = r2[r3]
        L_0x0337:
            if (r9 == 0) goto L_0x033a
            goto L_0x033c
        L_0x033a:
            r9 = r2[r5]
        L_0x033c:
            if (r6 == 0) goto L_0x033f
            goto L_0x0341
        L_0x033f:
            r6 = r2[r10]
        L_0x0341:
            r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r3, r9, r6)
        L_0x0344:
            int r2 = defpackage.nwb.AppCompatTextView_drawableTint
            boolean r2 = r0.hasValue(r2)
            if (r2 == 0) goto L_0x0369
            int r2 = defpackage.nwb.AppCompatTextView_drawableTint
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x0362
            r3 = 0
            int r3 = r0.getResourceId(r2, r3)
            if (r3 == 0) goto L_0x0362
            android.content.res.ColorStateList r3 = defpackage.d8.r(r12, r3)
            if (r3 == 0) goto L_0x0362
            goto L_0x0366
        L_0x0362:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r2)
        L_0x0366:
            defpackage.qge.f(r11, r3)
        L_0x0369:
            int r2 = defpackage.nwb.AppCompatTextView_drawableTintMode
            boolean r2 = r0.hasValue(r2)
            if (r2 == 0) goto L_0x037f
            int r2 = defpackage.nwb.AppCompatTextView_drawableTintMode
            int r2 = r0.getInt(r2, r7)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = defpackage.bn4.c(r2, r3)
            defpackage.qge.g(r11, r2)
        L_0x037f:
            int r2 = defpackage.nwb.AppCompatTextView_firstBaselineToTopHeight
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = defpackage.nwb.AppCompatTextView_lastBaselineToBottomHeight
            int r3 = r0.getDimensionPixelSize(r3, r7)
            int r4 = defpackage.nwb.AppCompatTextView_lineHeight
            boolean r4 = r0.hasValue(r4)
            if (r4 == 0) goto L_0x03b2
            int r4 = defpackage.nwb.AppCompatTextView_lineHeight
            android.util.TypedValue r4 = r0.peekValue(r4)
            if (r4 == 0) goto L_0x03a9
            int r5 = r4.type
            r6 = 5
            if (r5 != r6) goto L_0x03a9
            int r4 = r4.data
            r5 = r4 & 15
            float r4 = android.util.TypedValue.complexToFloat(r4)
            goto L_0x03b4
        L_0x03a9:
            int r4 = defpackage.nwb.AppCompatTextView_lineHeight
            int r4 = r0.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
        L_0x03b0:
            r5 = r7
            goto L_0x03b4
        L_0x03b2:
            r4 = r1
            goto L_0x03b0
        L_0x03b4:
            r0.recycle()
            if (r2 == r7) goto L_0x03bf
            defpackage.e07.m(r2)
            defpackage.rge.d(r11, r2)
        L_0x03bf:
            if (r3 == r7) goto L_0x03ed
            defpackage.e07.m(r3)
            android.text.TextPaint r0 = r11.getPaint()
            android.graphics.Paint$FontMetricsInt r0 = r0.getFontMetricsInt()
            boolean r2 = r11.getIncludeFontPadding()
            if (r2 == 0) goto L_0x03d5
            int r0 = r0.bottom
            goto L_0x03d7
        L_0x03d5:
            int r0 = r0.descent
        L_0x03d7:
            int r2 = java.lang.Math.abs(r0)
            if (r3 <= r2) goto L_0x03ed
            int r3 = r3 - r0
            int r0 = r11.getPaddingLeft()
            int r2 = r11.getPaddingTop()
            int r6 = r11.getPaddingRight()
            r11.setPadding(r0, r2, r6, r3)
        L_0x03ed:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0415
            if (r5 != r7) goto L_0x03f8
            int r0 = (int) r4
            androidx.core.widget.a.a(r11, r0)
            goto L_0x0415
        L_0x03f8:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L_0x0402
            defpackage.sge.a(r11, r5, r4)
            goto L_0x0415
        L_0x0402:
            android.content.res.Resources r0 = r11.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r5, r4, r0)
            int r0 = java.lang.Math.round(r0)
            androidx.core.widget.a.a(r11, r0)
        L_0x0415:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i2) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, nwb.TextAppearance);
        ydc ydc = new ydc(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(nwb.TextAppearance_textAllCaps);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(nwb.TextAppearance_textAllCaps, false));
        }
        if (obtainStyledAttributes.hasValue(nwb.TextAppearance_android_textSize) && obtainStyledAttributes.getDimensionPixelSize(nwb.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(ydc, context);
        if (obtainStyledAttributes.hasValue(nwb.TextAppearance_fontVariationSettings) && (string = obtainStyledAttributes.getString(nwb.TextAppearance_fontVariationSettings)) != null) {
            ho.d(textView, string);
        }
        ydc.E();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new od3(2);
        }
        od3 od3 = this.h;
        od3.d = colorStateList;
        od3.c = colorStateList != null;
        this.b = od3;
        this.c = od3;
        this.d = od3;
        this.e = od3;
        this.f = od3;
        this.g = od3;
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new od3(2);
        }
        od3 od3 = this.h;
        od3.e = mode;
        od3.b = mode != null;
        this.b = od3;
        this.c = od3;
        this.d = od3;
        this.e = od3;
        this.f = od3;
        this.g = od3;
    }

    public final void k(ydc ydc, Context context) {
        String string;
        int i2 = nwb.TextAppearance_android_textStyle;
        int i3 = this.j;
        TypedArray typedArray = (TypedArray) ydc.c;
        this.j = typedArray.getInt(i2, i3);
        int i4 = typedArray.getInt(nwb.TextAppearance_android_textFontWeight, -1);
        this.k = i4;
        if (i4 != -1) {
            this.j &= 2;
        }
        boolean z = true;
        if (typedArray.hasValue(nwb.TextAppearance_android_fontFamily) || typedArray.hasValue(nwb.TextAppearance_fontFamily)) {
            this.l = null;
            int i5 = typedArray.hasValue(nwb.TextAppearance_fontFamily) ? nwb.TextAppearance_fontFamily : nwb.TextAppearance_android_fontFamily;
            int i6 = this.k;
            int i7 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface A = ydc.A(i5, this.j, new eo(this, i6, i7, new WeakReference(this.a)));
                    if (A != null) {
                        if (this.k != -1) {
                            this.l = io.a(Typeface.create(A, 0), this.k, (this.j & 2) != 0);
                        } else {
                            this.l = A;
                        }
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (string = typedArray.getString(i5)) != null) {
                if (this.k != -1) {
                    Typeface create = Typeface.create(string, 0);
                    int i8 = this.k;
                    if ((this.j & 2) == 0) {
                        z = false;
                    }
                    this.l = io.a(create, i8, z);
                    return;
                }
                this.l = Typeface.create(string, this.j);
            }
        } else if (typedArray.hasValue(nwb.TextAppearance_android_typeface)) {
            this.m = false;
            int i9 = typedArray.getInt(nwb.TextAppearance_android_typeface, 1);
            if (i9 == 1) {
                this.l = Typeface.SANS_SERIF;
            } else if (i9 == 2) {
                this.l = Typeface.SERIF;
            } else if (i9 == 3) {
                this.l = Typeface.MONOSPACE;
            }
        }
    }
}
