package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;
import ru.ok.tamtam.photoeditor.view.colorselector.ColorSelectorView;

/* renamed from: ppa  reason: default package */
public final class ppa implements View.OnClickListener, f33 {
    public static final int[] B0 = {-1, -16777216, -1226410, -160462, -144548, -9387952, -13068304, -9863937, -6092870, -3078039, -1210994, -11565, -140617, -15486, -2977978, -6724551, -12377308, -14923223, -14277082, -13224394, -11184811, -9211021, -6710887, -5066062, -3684409, -2368549, -1052689};
    public Toast A0;
    public final ImageButton X;
    public final ImageButton Y;
    public final TextView Z;
    public final HashSet a = new HashSet();
    public final View b;
    public final kp c;
    public final ImageButton o;
    public final ImageButton w0;
    public final uq0 x0;
    public final AppCompatTextView y0;
    public npa z0;

    public ppa(View view, kp kpVar) {
        this.b = view;
        this.c = kpVar;
        ImageButton imageButton = (ImageButton) view.findViewById(yqb.act_photo_editor__btn_sticker);
        this.o = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) view.findViewById(yqb.act_photo_editor__btn_undo);
        this.X = imageButton2;
        imageButton2.setOnClickListener(this);
        ImageButton imageButton3 = (ImageButton) view.findViewById(yqb.act_photo_editor__btn_done);
        this.Y = imageButton3;
        imageButton3.setOnClickListener(this);
        ImageButton imageButton4 = (ImageButton) view.findViewById(yqb.act_photo_editor__btn_close);
        imageButton4.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(yqb.act_photo_editor__btn_clear);
        this.Z = textView;
        textView.setOnClickListener(this);
        ImageButton imageButton5 = (ImageButton) view.findViewById(yqb.act_photo_editor__btn_line_width);
        this.w0 = imageButton5;
        imageButton5.setOnClickListener(this);
        view.findViewById(yqb.act_photo_editor__fl_line_width).setOnClickListener(this);
        ColorSelectorView colorSelectorView = (ColorSelectorView) view.findViewById(yqb.act_photo_editor__view_color_selector);
        colorSelectorView.setColors(B0);
        colorSelectorView.setListener(this);
        uq0 uq0 = (uq0) view.findViewById(yqb.act_photo_editor__view_brush_width);
        this.x0 = uq0;
        ((BrushWidthViewImpl) uq0).H0.add(this);
        Context context = view.getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        view.setBackgroundColor(E.m);
        View findViewById = view.findViewById(yqb.act_photo_editor__rl_buttons);
        int i = E.H;
        findViewById.setBackgroundColor(i);
        view.findViewById(yqb.act_photo_editor__rl_controls).setBackgroundColor(i);
        view.findViewById(yqb.act_photo_editor__editor).setBackgroundColor(i);
        int i2 = E.w;
        imageButton4.setColorFilter(i2);
        imageButton4.setBackground(E.a());
        imageButton3.setColorFilter(E.k);
        imageButton3.setBackground(E.a());
        imageButton2.setColorFilter(i2);
        imageButton2.setBackground(E.a());
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{E.M, E.F}));
        textView.setBackground(swb.C(0, E.i));
        Context context2 = view.getContext();
        zg4 b2 = zg4.b();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        this.y0 = appCompatTextView;
        appCompatTextView.setBackgroundColor(Color.parseColor("#404040"));
        this.y0.setTextColor(-1);
        AppCompatTextView appCompatTextView2 = this.y0;
        int i3 = b2.k;
        appCompatTextView2.setPadding(i3, i3, i3, i3);
        Resources resources = context2.getResources();
        int i4 = zhc.L;
        ThreadLocal threadLocal = ubc.a;
        Drawable a2 = obc.a(resources, i4, (Resources.Theme) null);
        a2.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.y0.setCompoundDrawablesRelativeWithIntrinsicBounds(a2, (Drawable) null, (Drawable) null, (Drawable) null);
        this.y0.setCompoundDrawablePadding(b2.h);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = (float) b2.i;
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, (RectF) null, (float[]) null));
        shapeDrawable.setColorFilter(Color.parseColor("#404040"), PorterDuff.Mode.SRC);
        this.y0.setBackground(shapeDrawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if ((r3.X && r3.o) != (r7 && r6)) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.npa r11) {
        /*
            r10 = this;
            boolean r0 = r11.b
            r1 = 1
            r0 = r0 ^ r1
            android.widget.ImageButton r2 = r10.X
            at7.A(r2, r0)
            boolean r0 = r11.c
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = r2
            goto L_0x0011
        L_0x0010:
            r0 = 4
        L_0x0011:
            android.widget.TextView r3 = r10.Z
            r3.setVisibility(r0)
            android.widget.ImageButton r0 = r10.Y
            boolean r3 = r11.Y
            r0.setEnabled(r3)
            if (r3 == 0) goto L_0x0022
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0025
        L_0x0022:
            r3 = 1050253722(0x3e99999a, float:0.3)
        L_0x0025:
            r0.setAlpha(r3)
            npa r3 = r10.z0
            r4 = 0
            android.widget.ImageButton r5 = r10.o
            boolean r6 = r11.X
            boolean r7 = r11.o
            if (r3 == 0) goto L_0x0047
            boolean r8 = r3.X
            if (r8 == 0) goto L_0x003d
            boolean r8 = r3.o
            if (r8 == 0) goto L_0x003d
            r8 = r1
            goto L_0x003e
        L_0x003d:
            r8 = r2
        L_0x003e:
            if (r7 == 0) goto L_0x0044
            if (r6 == 0) goto L_0x0044
            r9 = r1
            goto L_0x0045
        L_0x0044:
            r9 = r2
        L_0x0045:
            if (r8 == r9) goto L_0x00a5
        L_0x0047:
            if (r7 == 0) goto L_0x004c
            if (r6 == 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            if (r3 == 0) goto L_0x0080
            android.widget.Toast r3 = r10.A0
            if (r3 == 0) goto L_0x0058
            r3.cancel()
            r10.A0 = r4
        L_0x0058:
            androidx.appcompat.widget.AppCompatTextView r3 = r10.y0
            if (r1 == 0) goto L_0x005f
            int r6 = defpackage.cic.n2
            goto L_0x0061
        L_0x005f:
            int r6 = defpackage.cic.m2
        L_0x0061:
            r3.setText(r6)
            android.widget.Toast r3 = new android.widget.Toast
            android.content.Context r6 = r5.getContext()
            r3.<init>(r6)
            r10.A0 = r3
            r6 = 17
            r3.setGravity(r6, r2, r2)
            android.widget.Toast r3 = r10.A0
            androidx.appcompat.widget.AppCompatTextView r6 = r10.y0
            r3.setView(r6)
            android.widget.Toast r3 = r10.A0
            r3.show()
        L_0x0080:
            if (r1 == 0) goto L_0x0094
            int r1 = defpackage.zhc.x
            r5.setImageResource(r1)
            boolean r1 = r11.Z
            if (r1 == 0) goto L_0x008e
            int r1 = defpackage.zhc.e0
            goto L_0x0090
        L_0x008e:
            int r1 = defpackage.zhc.S
        L_0x0090:
            r0.setImageResource(r1)
            goto L_0x00a5
        L_0x0094:
            r5.setBackgroundColor(r2)
            r1 = -1
            r5.setColorFilter(r1)
            int r1 = defpackage.zhc.w
            r5.setImageResource(r1)
            int r1 = defpackage.zhc.m
            r0.setImageResource(r1)
        L_0x00a5:
            npa r0 = r10.z0
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.o
            if (r0 == r7) goto L_0x00bb
        L_0x00ad:
            if (r7 == 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r2 = 8
        L_0x00b2:
            r5.setVisibility(r2)
            if (r7 == 0) goto L_0x00b8
            r4 = r10
        L_0x00b8:
            r5.setOnClickListener(r4)
        L_0x00bb:
            r10.z0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppa.a(npa):void");
    }

    public final void b(rf3 rf3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            rf3.accept((jpa) it.next());
        }
    }

    public final void c(int i) {
        float[] fArr = new float[3];
        ThreadLocal threadLocal = j33.a;
        j33.a(Color.red(i), Color.green(i), Color.blue(i), fArr);
        int i2 = fArr[2] < 0.9f ? -1 : -16777216;
        ImageButton imageButton = this.w0;
        imageButton.setColorFilter(i2);
        imageButton.setBackground(swb.H(Integer.valueOf(i), (Integer) null, (Integer) null));
        this.x0.setPreviewColor(i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jpa) it.next()).b.f = i;
        }
        this.c.j(i, "app.editor.color");
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == yqb.act_photo_editor__btn_undo) {
            b(new xe9(15));
        } else if (id == yqb.act_photo_editor__btn_close) {
            b(new xe9(16));
        } else if (id == yqb.act_photo_editor__btn_done) {
            b(new xe9(17));
        } else if (id == yqb.act_photo_editor__btn_clear) {
            b(new xe9(18));
        } else if (id == yqb.act_photo_editor__btn_line_width) {
            BrushWidthViewImpl brushWidthViewImpl = (BrushWidthViewImpl) this.x0;
            brushWidthViewImpl.setVisibility(brushWidthViewImpl.getVisibility() == 0 ? 8 : 0);
        } else if (id == yqb.act_photo_editor__btn_sticker) {
            b(new xe9(19));
        }
    }
}
