package ru.ok.messages.media.crop;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import one.me.image.crop.view.ImageCropView;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgTamCropImage extends FrgBase {
    public ImageCropView F1;
    public ImageButton G1;
    public ImageButton H1;
    public ImageButton I1;
    public ImageButton J1;
    public TextView K1;

    public final void M0(Bundle bundle) {
        super.M0(bundle);
        bundle.putParcelable("ru.ok.tamtam.extra.CROP_STATE", this.F1.getCropState());
    }

    public final void P0(View view, Bundle bundle) {
        ImageCropView findViewById = view.findViewById(yqb.frg_tam_crop_image__iv_crop);
        this.F1 = findViewById;
        findViewById.setFreestyleCropMode(1);
        this.F1.setRotateEnabled(false);
        this.F1.setMaxScaleMultiplier(4.0f);
        ImageCropView imageCropView = this.F1;
        yzc yzc = ((k93) this.t1.b).n().b;
        yzc.getClass();
        imageCropView.setMinImageSize((float) ((int) yzc.o(PmsKey.f77minimagesidesize, (long) 64)));
        this.G1 = (ImageButton) view.findViewById(yqb.frg_tam_crop_image__rotate);
        this.H1 = (ImageButton) view.findViewById(yqb.frg_tam_crop_image__flip);
        this.K1 = (TextView) view.findViewById(yqb.frg_tam_crop_image__btn_clear);
        this.I1 = (ImageButton) view.findViewById(yqb.frg_tam_crop_image__btn_done);
        this.J1 = (ImageButton) view.findViewById(yqb.frg_tam_crop_image__btn_close);
        Uri uri = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.SOURCE_URI");
        Uri uri2 = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.RESULT_URI");
        udd.p("ru.ok.messages.media.crop.FrgTamCropImage", "onViewCreated:\nsourceUri: %s\nresultUri: %s", new Object[]{uri.toString(), uri2.toString()});
        jw3 jw3 = bundle != null ? (jw3) bundle.getParcelable("ru.ok.tamtam.extra.CROP_STATE") : this.Z.containsKey("ru.ok.tamtam.extra.CROP_STATE") ? (jw3) this.Z.getParcelable("ru.ok.tamtam.extra.CROP_STATE") : null;
        try {
            j76 j76 = this.F1.a;
            int maxBitmapSize = j76.getMaxBitmapSize();
            new vm0(j76.getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new wwc(28, j76)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            j76.L0 = jw3;
        } catch (Exception e) {
            udd.s("ru.ok.messages.media.crop.FrgTamCropImage", "fail to setImageUri", e);
            s1();
        }
        at7.i(this.G1, new j16(this, 0));
        at7.i(this.H1, new j16(this, 1));
        at7.i(this.K1, new j16(this, 2));
        at7.i(this.J1, new j16(this, 3));
        at7.i(this.I1, new j16(this, 4));
        this.G1.setBackground(this.v1.a());
        this.H1.setBackground(this.v1.a());
        this.K1.setBackground(swb.C(0, this.v1.i));
        this.I1.setBackground(this.v1.a());
        this.J1.setBackground(this.v1.a());
        this.G1.setColorFilter(this.v1.w);
        this.H1.setColorFilter(this.v1.w);
        this.I1.setColorFilter(this.v1.k);
        this.J1.setColorFilter(this.v1.w);
        TextView textView = this.K1;
        wce wce = this.v1;
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{wce.M, wce.w}));
    }

    public final String g1() {
        return "CROP_IMAGE";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.Context, r5, android.app.Activity] */
    public final void s1() {
        ? h1 = h1();
        if (h1 != 0) {
            h1.setResult(0);
            int i = cic.D;
            Handler handler = a06.h;
            a06.H(0, h1, h1.getString(i));
            f1();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r5, android.app.Activity] */
    public final void t1() {
        ? h1 = h1();
        if (h1 != 0) {
            Intent intent = new Intent();
            Uri uri = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.RESULT_URI");
            intent.putExtra("ru.ok.tamtam.extra.RESULT_URI", uri);
            udd.p("ru.ok.messages.media.crop.FrgTamCropImage", "finishWithSuccess: result: %s", new Object[]{uri.toString()});
            Uri uri2 = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI");
            if (uri2 != null) {
                udd.p("ru.ok.messages.media.crop.FrgTamCropImage", "finishWithSuccess: additionalResult: %s", new Object[]{uri2.toString()});
                intent.putExtra("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI", uri2);
            }
            j76 j76 = this.F1.a;
            if (!j76.getInitialMatrix().equals(j76.y0)) {
                intent.putExtra("ru.ok.tamtam.extra.CROP_STATE", this.F1.getCropState());
            }
            h1.setResult(-1, intent);
            f1();
        }
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(zrb.frg_tam_crop_image, viewGroup, false);
    }
}
