package ru.ok.messages.media.crop;

import android.net.Uri;
import android.os.Bundle;

public class ActTamCropImage extends r5 {
    public wf8 Y0;

    public final String Z() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [androidx.fragment.app.b, r5, im, ru.ok.messages.media.crop.ActTamCropImage, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(zrb.act_tam_crop_image);
        f0(this.Y0.L);
        findViewById(yqb.act_tam_crop_image__root).setBackgroundColor(t().m);
        if (bundle == null) {
            boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.SAVE_AS_PNG", false);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ru.ok.tamtam.extra.SOURCE_URI", (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.SOURCE_URI"));
            bundle2.putParcelable("ru.ok.tamtam.extra.RESULT_URI", (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.RESULT_URI"));
            bundle2.putParcelable("ru.ok.tamtam.extra.ADDITIONAL_SOURCE_URI", (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.ADDITIONAL_SOURCE_URI"));
            bundle2.putParcelable("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI", (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.ADDITIONAL_RESULT_URI"));
            bundle2.putParcelable("ru.ok.tamtam.extra.CROP_STATE", getIntent().getParcelableExtra("ru.ok.tamtam.extra.CROP_STATE"));
            bundle2.putBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG", booleanExtra);
            FrgTamCropImage frgTamCropImage = new FrgTamCropImage();
            frgTamCropImage.Y0(bundle2);
            kjd.c(P(), yqb.act_tam_crop_image__container, frgTamCropImage, "ru.ok.messages.media.crop.FrgTamCropImage");
        }
    }

    public final wce t() {
        if (this.Y0 == null) {
            this.Y0 = wf8.e0;
        }
        return this.Y0;
    }
}
