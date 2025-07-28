package ru.ok;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/TamBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lade;", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
public abstract class TamBottomSheetDialogFragment extends BottomSheetDialogFragment implements ade {
    public final int G1;

    public TamBottomSheetDialogFragment(int i) {
        this.G1 = i;
    }

    public final int h1() {
        return pvb.UiUtils_LightBottomSheetDialog;
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog = this.A1;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setBackgroundDrawable((Drawable) null);
        }
        return layoutInflater.inflate(this.G1, viewGroup, false);
    }
}
