package ru.ok.messages.photoeditor;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import java.io.File;
import java.util.List;
import java.util.UUID;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.tamtam.android.prefs.PmsKey;

public class ActPhotoEditor extends r5 implements ipa, oc3 {
    public static final /* synthetic */ int d1 = 0;
    public jpa Y0;
    public wf8 Z0;
    public boolean a1;
    public e3 b1;
    public final r7e c1 = new r7e(new c6(1, this));

    /* JADX WARNING: type inference failed for: r11v0, types: [r5, ru.ok.messages.photoeditor.ActPhotoEditor, android.app.Activity] */
    public final void S(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("photo_editor:cancel_dialog")) {
            jpa jpa = this.Y0;
            ls4 ls4 = jpa.b;
            ps4 ps4 = ls4.a;
            List<is4> layers = ps4.getLayers();
            for (int size = layers.size() - 1; size >= 0; size--) {
                is4 is4 = layers.get(size);
                if (!(is4 instanceof sd0)) {
                    ps4.a.remove(is4);
                    ps4.invalidate();
                }
            }
            ls4.b();
            npa npa = jpa.e;
            npa.getClass();
            npa npa2 = new npa(false, false, false, npa.o, npa.X, true, npa.Z);
            jpa.e = npa2;
            jpa.a.a(npa2);
            return;
        }
        setResult(0);
        finish();
    }

    public final String Z() {
        return "EDIT_IMAGE";
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.fragment.app.b, r5, ru.ok.messages.photoeditor.ActPhotoEditor, android.app.Activity] */
    public final void i0() {
        if (!this.Y0.b.h) {
            setResult(0);
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("photo_editor:cancel_dialog", true);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", cic.k2);
        bundle2.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", cic.j2);
        bundle2.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", cic.r);
        bundle2.putBundle("ru.ok.tamtam.extra.DATA", bundle);
        ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.Y0(bundle2);
        confirmationDialog.l1(P(), "ru.ok.messages.views.dialogs.ConfirmationDialog");
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [android.content.Context, r5, ru.ok.messages.photoeditor.ActPhotoEditor, android.app.Activity] */
    public final void j0(nd4 nd4) {
        int i;
        js4 a = this.Y0.b.a();
        if (a.a.isEmpty()) {
            a = null;
        }
        boolean z = true;
        boolean z2 = a != null && a.o;
        jpa jpa = this.Y0;
        if (!this.a1 || z2) {
            z = false;
        }
        ls4 ls4 = jpa.b;
        Rect bounds = ls4.a.getBounds();
        int i2 = 2000;
        if (bounds.width() > bounds.height()) {
            i = (int) ((((float) bounds.height()) / ((float) bounds.width())) * ((float) 2000));
        } else {
            i2 = (int) ((((float) bounds.width()) / ((float) bounds.height())) * ((float) 2000));
            i = 2000;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        ps4 ps4 = ls4.a;
        Rect resultBounds = ps4.getResultBounds();
        Canvas canvas = new Canvas(createBitmap);
        for (is4 next : ps4.getLayers()) {
            if (next instanceof sd0) {
                if (z) {
                    sd0 sd0 = (sd0) next;
                    sd0.getClass();
                    int width = canvas.getWidth();
                    int height = canvas.getHeight();
                    Drawable drawable = sd0.a;
                    drawable.setBounds(0, 0, width, height);
                    drawable.draw(canvas);
                }
                canvas.scale(((float) i2) / ((float) resultBounds.width()), ((float) i) / ((float) resultBounds.height()));
                canvas.translate((float) (-resultBounds.left), (float) (-resultBounds.top));
            } else {
                next.draw(canvas);
            }
        }
        if (z2) {
            yzc yzc = ((k93) this.O0.b).n().b;
            yzc.getClass();
            createBitmap = at7.K((int) yzc.o(PmsKey.f78minstickersize, (long) 432), (int) yzc.o(PmsKey.f69maxstickersize, (long) 512), createBitmap);
        }
        Intent intent = new Intent();
        File q = ((k93) this.O0.b).h().q(UUID.randomUUID().toString() + ".png");
        try {
            at7.N(q.getPath(), createBitmap, 100, Bitmap.CompressFormat.PNG);
            intent.putExtra("photo_editor:result_uri", Uri.fromFile(q));
            intent.putExtra("photo_editor:editor_state", a);
            intent.putExtra("photo_editor:delayed_attrs", nd4);
            setResult(-1, intent);
            finish();
        } catch (Exception unused) {
            int i3 = cic.D;
            Handler handler = a06.h;
            a06.H(0, this, getString(i3));
            setResult(0);
            finish();
        }
    }

    public final void onBackPressed() {
        if (!this.Y0.b.h) {
            super.onBackPressed();
        } else {
            i0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: android.content.Context} */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, i6g] */
    /* JADX WARNING: type inference failed for: r2v23, types: [java.lang.Object, i6g] */
    /* JADX WARNING: type inference failed for: r0v37, types: [java.lang.Object, i6g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r9 = r17
            r10 = r18
            r11 = 1
            r0 = -1
            r6 = 0
            super.onCreate(r18)
            wf8 r1 = r9.Z0
            int r1 = r1.L
            r9.f0(r1)
            int r1 = defpackage.zrb.act_photo_editor
            r9.setContentView((int) r1)
            android.content.Intent r1 = r17.getIntent()
            java.lang.String r2 = "photo_editor:is_drawing"
            r7 = 0
            boolean r1 = r1.getBooleanExtra(r2, r7)
            r9.a1 = r1
            v2b r1 = r9.O0
            java.lang.Object r1 = r1.b
            k93 r1 = (defpackage.k93) r1
            o2a r1 = (o2a) r1
            w4 r1 = r1.getAccessor()
            java.lang.Class<xce> r2 = defpackage.xce.class
            java.lang.Object r1 = r1.c(r2)
            xce r1 = (defpackage.xce) r1
            wce r1 = r1.c()
            int r2 = defpackage.yqb.act_photo_editor__editor
            android.view.View r2 = r9.findViewById(r2)
            ru.ok.tamtam.photoeditor.view.EditorSurfaceViewContainer r2 = (ru.ok.tamtam.photoeditor.view.EditorSurfaceViewContainer) r2
            ps4 r8 = r2.getEditorSurfaceView()
            boolean r2 = r9.a1
            if (r2 != 0) goto L_0x0053
            wf8 r2 = r9.Z0
            int r2 = r2.m
            r8.setBackgroundColor(r2)
            goto L_0x0060
        L_0x0053:
            boolean r2 = r1.c
            if (r2 == 0) goto L_0x005d
            int r2 = r1.m
            r8.setBackgroundColor(r2)
            goto L_0x0060
        L_0x005d:
            r8.setBackgroundColor(r0)
        L_0x0060:
            ppa r12 = new ppa
            int r2 = defpackage.yqb.act_photo_editor__root
            android.view.View r2 = r9.findViewById(r2)
            v2b r3 = r9.O0
            java.lang.Object r3 = r3.b
            k93 r3 = (defpackage.k93) r3
            o2a r3 = (o2a) r3
            j2b r3 = r3.n()
            kp r3 = r3.c
            r12.<init>(r2, r3)
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r3 = "photo_editor:background_uri"
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto L_0x0094
            i6g r0 = new i6g
            r0.<init>()
            r0.a = r2
            r0.c = r6
            r0.b = r7
            r4 = r0
            goto L_0x00a0
        L_0x0094:
            i6g r2 = new i6g
            r2.<init>()
            r2.b = r0
            r2.a = r6
            r2.c = r6
            r4 = r2
        L_0x00a0:
            boolean r0 = r1.c
            if (r0 == 0) goto L_0x00a7
            int r0 = defpackage.zhc.c
            goto L_0x00a9
        L_0x00a7:
            int r0 = defpackage.zhc.d
        L_0x00a9:
            android.content.res.Resources r1 = r17.getResources()
            java.lang.ThreadLocal r2 = ubc.a
            android.graphics.drawable.Drawable r0 = obc.a(r1, r0, r6)
            if (r0 == 0) goto L_0x01ba
            i6g r5 = new i6g
            r5.<init>()
            r5.c = r0
            r5.a = r6
            r5.b = r7
            bd4 r13 = new bd4
            android.content.res.Resources r2 = r17.getResources()
            v2b r0 = r9.O0
            java.lang.Object r0 = r0.b
            k93 r0 = (defpackage.k93) r0
            o2a r0 = (o2a) r0
            mbe r3 = r0.q()
            r0 = r13
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r1 = "photo_editor:editor_state"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x00f0
            android.content.Intent r0 = r17.getIntent()
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            js4 r0 = (defpackage.js4) r0
            r5 = r0
            goto L_0x00f1
        L_0x00f0:
            r5 = r6
        L_0x00f1:
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r1 = "photo_editor:start_from_draw_sticker"
            boolean r14 = r0.getBooleanExtra(r1, r7)
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r1 = "photo_editor:draw_sticker_enabled"
            boolean r6 = r0.getBooleanExtra(r1, r7)
            jpa r15 = new jpa
            ls4 r2 = new ls4
            r2.<init>(r8)
            r7e r8 = r9.c1
            java.lang.Object r0 = r8.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r16 = r0.booleanValue()
            r0 = r15
            r1 = r12
            r3 = r17
            r4 = r13
            r7 = r14
            r13 = r8
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.Y0 = r15
            int[] r0 = defpackage.ppa.B0
            r1 = 6
            r0 = r0[r1]
            kp r1 = r12.c
            x97 r2 = r1.g
            java.lang.String r3 = "app.editor.color"
            int r0 = r2.getInt(r3, r0)
            r12.c(r0)
            android.view.View r0 = r12.b
            r0.getContext()
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = defpackage.zg4.a(r0)
            x97 r2 = r1.g
            java.lang.String r3 = "app.editor.width"
            int r0 = r2.getInt(r3, r0)
            if (r0 <= 0) goto L_0x016e
            float r0 = (float) r0
            uq0 r2 = r12.x0
            r2.setBrushWidth(r0)
            java.util.HashSet r2 = r12.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0159:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x016a
            java.lang.Object r4 = r2.next()
            jpa r4 = (defpackage.jpa) r4
            ls4 r4 = r4.b
            r4.g = r0
            goto L_0x0159
        L_0x016a:
            int r0 = (int) r0
            r1.j(r0, r3)
        L_0x016e:
            if (r10 == 0) goto L_0x019f
            jpa r0 = r9.Y0
            r0.getClass()
            java.lang.String r1 = "ru.ok.tamtam.extra.EDITOR_STATE"
            boolean r2 = r10.containsKey(r1)
            if (r2 == 0) goto L_0x018a
            android.os.Parcelable r1 = r10.getParcelable(r1)
            js4 r1 = (defpackage.js4) r1
            bd4 r2 = r0.d
            ls4 r3 = r0.b
            r2.a(r3, r1, r11)
        L_0x018a:
            java.lang.String r1 = "ru.ok.tamtam.extra.EDITOR_VIEW_STATE"
            boolean r2 = r10.containsKey(r1)
            if (r2 == 0) goto L_0x019f
            android.os.Parcelable r1 = r10.getParcelable(r1)
            npa r1 = (defpackage.npa) r1
            r0.e = r1
            ppa r0 = r0.a
            r0.a(r1)
        L_0x019f:
            java.lang.Object r0 = r13.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01b9
            vx5 r0 = r17.P()
            a6 r1 = new a6
            r1.<init>(r11, r9)
            java.lang.String r2 = "ru.ok.messages.photoeditor.ActPhotoEditor"
            ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment.q1(r2, r0, r9, r1)
        L_0x01b9:
            return
        L_0x01ba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "backgroundDrawable cannot be null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.photoeditor.ActPhotoEditor.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        tic.b((pn1) this.Y0.d.Y);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        jpa jpa = this.Y0;
        bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_STATE", jpa.b.a());
        bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE", jpa.e);
    }

    public final wce t() {
        if (this.Z0 == null) {
            this.Z0 = wf8.e0;
        }
        return this.Z0;
    }
}
