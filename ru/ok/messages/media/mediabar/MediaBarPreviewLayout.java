package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import ru.ok.messages.messages.widgets.MessageComposeEditText;

public class MediaBarPreviewLayout extends ConstraintLayout implements nz7, xhe {
    public static final /* synthetic */ int f1 = 0;
    public final zg4 K0;
    public final View L0;
    public final View M0;
    public final View N0;
    public final RecyclerView O0;
    public final View P0;
    public final ImageButton Q0;
    public final ImageButton R0;
    public final ImageButton S0;
    public final ImageButton T0;
    public final MessageComposeEditText U0;
    public final wk7 V0;
    public final mz7 W0;
    public lz7 X0;
    public Toast Y0;
    public final tg Z0;
    public final j2b a1;
    public boolean b1 = false;
    public boolean c1 = true;
    public boolean d1 = false;
    public int e1 = -1;

    /* JADX WARNING: type inference failed for: r7v0, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r14v1, types: [android.widget.TextView, ru.ok.messages.messages.widgets.MessageComposeEditText, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaBarPreviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o2a b = vl.b();
        getContext();
        zg4 b2 = zg4.b();
        this.K0 = b2;
        o2a o2a = b;
        tg c = o2a.c();
        this.Z0 = c;
        wk7 j = o2a.j();
        this.V0 = j;
        r10 d = o2a.d();
        this.a1 = o2a.n();
        View.inflate(getContext(), zrb.cl_media_bar_preview_layout, this);
        this.M0 = findViewById(yqb.cl_media_bar_preview_layout__top_panel);
        this.L0 = findViewById(yqb.cl_media_bar_preview_layout__bottom_panel);
        this.N0 = findViewById(yqb.media_bar_view__bottom_shadow);
        this.P0 = findViewById(yqb.cl_media_bar_preview_layout__separator_middle);
        RecyclerView findViewById = findViewById(yqb.cl_media_bar_preview_layout__rv_selected);
        this.O0 = findViewById;
        ImageButton imageButton = (ImageButton) findViewById(yqb.cl_media_bar_preview_layout__ib_send);
        this.Q0 = imageButton;
        ImageButton imageButton2 = (ImageButton) findViewById(yqb.cl_media_bar_preview_layout__ib_file);
        this.R0 = imageButton2;
        ImageButton imageButton3 = (ImageButton) findViewById(yqb.cl_media_bar_preview_layout__ib_collage);
        this.S0 = imageButton3;
        ImageButton imageButton4 = (ImageButton) findViewById(yqb.cl_media_bar_preview_layout__ib_cancel);
        this.T0 = imageButton4;
        ? r14 = (MessageComposeEditText) findViewById(yqb.cl_media_bar_preview_layout__edit_message);
        this.U0 = r14;
        c();
        w();
        findViewById.setHasFixedSize(true);
        getContext();
        findViewById.setLayoutManager(new LinearLayoutManager(0, false));
        findViewById.setItemAnimator(new w84());
        findViewById.j(new n51(b2.b, 4));
        mz7 mz7 = new mz7(getContext(), this, c, d, j, (bl7) o2a.getAccessor().c(bl7.class));
        this.W0 = mz7;
        mz7.A(true);
        findViewById.setAdapter(this.W0);
        r14.addTextChangedListener(new z2(4, this));
        r14.setInputType(933968);
        new yge(r14, e07.a(r14.getContext())).a();
        a24.a0(imageButton, new kz7(this, 0));
        imageButton.setLongClickable(true);
        imageButton.setOnLongClickListener(new wk0(2, this));
        a24.a0(imageButton2, new kz7(this, 1));
        a24.a0(imageButton3, new kz7(this, 2));
        a24.a0(imageButton4, new kz7(this, 3));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.widget.TextView, ru.ok.messages.messages.widgets.MessageComposeEditText] */
    public final void A() {
        boolean z = false;
        boolean z2 = true;
        boolean z3 = this.a1.c.s() && !this.c1;
        this.c1 = false;
        wk7 wk7 = this.V0;
        int b = wk7.f.b();
        View view = this.M0;
        if (b == 0) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            int i = this.e1;
            if (i != -1 && i < b) {
                this.O0.B0(b - 1);
            }
        }
        this.e1 = b;
        boolean z4 = this.b1;
        pwc pwc = wk7.f;
        ImageButton imageButton = this.R0;
        ImageButton imageButton2 = this.S0;
        if (z4) {
            imageButton2.setVisibility(8);
            imageButton.setVisibility(8);
            if (pwc.b() > 0) {
                z = true;
            }
            B(z);
        } else {
            this.Q0.setVisibility(0);
            int b2 = pwc.b();
            boolean z5 = b2 > 1;
            tg tgVar = this.Z0;
            if (z3) {
                if (z5) {
                    tgVar.a(imageButton2);
                } else {
                    tgVar.c(imageButton2);
                }
            } else if (z5) {
                imageButton2.setVisibility(0);
            } else {
                imageButton2.setVisibility(8);
            }
            if (!this.d1 && b2 <= 0) {
                z2 = false;
            }
            if (z3) {
                if (z2) {
                    tgVar.a(imageButton);
                } else {
                    tgVar.c(imageButton);
                }
            } else if (z2) {
                imageButton.setVisibility(0);
            } else {
                imageButton.setVisibility(8);
            }
        }
        CharSequence charSequence = pwc.k;
        if (charSequence != null) {
            this.U0.setText(charSequence);
        }
        w();
        this.W0.m();
    }

    public final void B(boolean z) {
        Editable text = this.U0.getText();
        this.Q0.setVisibility((z || !TextUtils.isEmpty(text != null ? text.toString().trim() : null)) ? 0 : 8);
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [android.widget.TextView, ru.ok.messages.messages.widgets.MessageComposeEditText, android.view.View, java.lang.Object] */
    public final void c() {
        Context context = getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        setBackgroundColor(0);
        this.O0.setBackgroundColor(E.m);
        View view = this.M0;
        int i = E.m;
        view.setBackgroundColor(i);
        this.L0.setBackgroundColor(i);
        this.P0.setBackgroundColor(E.K);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageButton imageButton = this.Q0;
        int i2 = E.k;
        imageButton.setColorFilter(i2, mode);
        imageButton.setBackground(E.a());
        re3 layoutParams = imageButton.getLayoutParams();
        layoutParams.width = -2;
        imageButton.setLayoutParams(layoutParams);
        at7.C(imageButton, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageButton.getLayoutParams();
        if (marginLayoutParams.bottomMargin != 0) {
            marginLayoutParams.bottomMargin = 0;
            imageButton.setLayoutParams(marginLayoutParams);
        }
        RippleDrawable a = E.a();
        ImageButton imageButton2 = this.R0;
        imageButton2.setBackground(a);
        RippleDrawable a2 = E.a();
        ImageButton imageButton3 = this.S0;
        imageButton3.setBackground(a2);
        int i3 = E.w;
        imageButton2.setColorFilter(i3, mode);
        imageButton3.setColorFilter(i3, mode);
        ImageButton imageButton4 = this.T0;
        imageButton4.setColorFilter(i3, mode);
        imageButton4.setBackground(E.a());
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(E.i), i != 0 ? new ColorDrawable(i) : null, (Drawable) null);
        rippleDrawable.setRadius(this.K0.n);
        imageButton4.setBackground(rippleDrawable);
        ? r9 = this.U0;
        r9.setTextColor(E.F);
        r9.setHintTextColor(E.M);
        Class<TextView> cls = TextView.class;
        try {
            Field declaredField = cls.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i4 = declaredField.getInt(r9);
            Field declaredField2 = cls.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(r9);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable b = gq3.b(r9.getContext(), i4);
            b.setColorFilter(new PorterDuffColorFilter(i2, mode));
            Drawable b2 = gq3.b(r9.getContext(), i4);
            b2.setColorFilter(new PorterDuffColorFilter(i2, mode));
            declaredField3.set(obj, new Drawable[]{b, b2});
        } catch (Throwable unused) {
        }
    }

    public int getBottomShadowHeight() {
        return this.N0.getHeight();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.messages.widgets.MessageComposeEditText, android.view.View] */
    public int getContentHeight() {
        ? r0 = this.U0;
        int measuredHeight = r0.getVisibility() == 0 ? r0.getMeasuredHeight() : 0;
        View view = this.M0;
        if (view.getVisibility() == 0) {
            measuredHeight += view.getMeasuredHeight();
        }
        int paddingBottom = getPaddingBottom();
        this.K0.getClass();
        if (paddingBottom < dh4.b((int) 200.0f)) {
            measuredHeight += getPaddingBottom();
        }
        return getPaddingTop() + measuredHeight;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    public int getHeightWithoutShadow() {
        return getHeight() - this.N0.getHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r0.getLayoutManager();
        r1 = r0.W0();
        r0 = r0.r(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getScrollPosition() {
        /*
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.O0
            androidx.recyclerview.widget.a r1 = r0.getLayoutManager()
            boolean r1 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r1 == 0) goto L_0x0039
            int r1 = r0.getWidth()
            if (r1 == 0) goto L_0x0039
            androidx.recyclerview.widget.a r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.W0()
            android.view.View r0 = r0.r(r1)
            if (r0 == 0) goto L_0x0039
            int r0 = r0.getLeft()
            zg4 r2 = r2.K0
            int r2 = r2.i
            int r2 = r2 / 2
            int r0 = r0 - r2
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        L_0x0039:
            android.util.Pair r2 = new android.util.Pair
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.MediaBarPreviewLayout.getScrollPosition():android.util.Pair");
    }

    public void setAnimojisEnabled(boolean z) {
        MessageComposeEditText messageComposeEditText = this.U0;
        if (messageComposeEditText != null) {
            messageComposeEditText.setAnimojiEnabled(z);
        }
    }

    public void setChatMode(mi2 mi2) {
        int i = ((Boolean) mi2.a.getValue()).booleanValue() ? zhc.e0 : zhc.V;
        ImageButton imageButton = this.Q0;
        imageButton.setImageResource(i);
        imageButton.setLongClickable(((Boolean) mi2.a.getValue()).booleanValue());
    }

    public void setFullScreen(boolean z) {
        this.d1 = z;
        A();
        c();
    }

    public void setListener(lz7 lz7) {
        this.X0 = lz7;
    }

    public void setMessageEdit(boolean z) {
        this.b1 = z;
        A();
        c();
    }

    public void setShouldApplyHighlight(boolean z) {
        this.W0.y0 = z;
    }

    public final void w() {
        int t = hr1.t(this.V0.f.l);
        ImageButton imageButton = this.R0;
        ImageButton imageButton2 = this.S0;
        if (t == 1) {
            imageButton2.setImageResource(zhc.r);
            imageButton.setImageResource(zhc.A);
        } else if (t != 2) {
            imageButton2.setImageResource(zhc.r);
            imageButton.setImageResource(zhc.z);
        } else {
            imageButton2.setImageResource(zhc.s);
            imageButton.setImageResource(zhc.z);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    public final void x(int i) {
        RecyclerView recyclerView = this.O0;
        if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && recyclerView.getWidth() != 0) {
            LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
            View childAt = recyclerView.getChildAt(i);
            layoutManager.n1(i, Math.max(0, (recyclerView.getWidth() / 2) - ((childAt != null ? childAt.getWidth() : getContext().getResources().getDimensionPixelOffset(mmb.compose_view_item_height) - this.K0.i) / 2)));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ru.ok.messages.media.mediabar.MediaBarPreviewLayout, android.view.View] */
    public final void y(int i) {
        Toast toast = this.Y0;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(getContext(), i, 0);
        this.Y0 = makeText;
        makeText.show();
    }
}
