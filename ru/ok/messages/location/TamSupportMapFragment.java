package ru.ok.messages.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.ok.messages.location.view.SupportMapFragmentImpl;

public class TamSupportMapFragment extends SupportMapFragmentImpl {
    public FrameLayout q1;
    public hne r1;

    public final View l0() {
        return this.q1;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.widget.FrameLayout, hne, android.view.ViewGroup] */
    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.q1 = (FrameLayout) TamSupportMapFragment.super.y0(layoutInflater, viewGroup, bundle);
        ? frameLayout = new FrameLayout(c0());
        this.r1 = frameLayout;
        frameLayout.addView(this.q1);
        return this.r1;
    }
}
