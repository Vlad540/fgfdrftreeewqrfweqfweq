package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends o3 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new udf(17);
    public static final Integer J0 = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public Boolean A0;
    public Boolean B0;
    public Float C0 = null;
    public Float D0 = null;
    public LatLngBounds E0 = null;
    public Boolean F0;
    public Integer G0 = null;
    public String H0 = null;
    public int I0;
    public Boolean X;
    public Boolean Y;
    public Boolean Z;
    public Boolean a;
    public Boolean b;
    public int c = -1;
    public CameraPosition o;
    public Boolean w0;
    public Boolean x0;
    public Boolean y0;
    public Boolean z0;

    public static GoogleMapOptions b(Context context, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, wvb.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(wvb.MapAttrs_mapType)) {
            googleMapOptions.c = obtainAttributes.getInt(wvb.MapAttrs_mapType, -1);
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_zOrderOnTop)) {
            googleMapOptions.a = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_useViewLifecycle)) {
            googleMapOptions.b = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_uiCompass)) {
            googleMapOptions.Y = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_uiRotateGestures)) {
            googleMapOptions.y0 = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.F0 = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_uiScrollGestures)) {
            googleMapOptions.Z = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_uiTiltGestures)) {
            googleMapOptions.x0 = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_uiZoomGestures)) {
            googleMapOptions.w0 = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_uiZoomControls)) {
            googleMapOptions.X = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_liteMode)) {
            googleMapOptions.z0 = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_uiMapToolbar)) {
            googleMapOptions.A0 = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_ambientEnabled)) {
            googleMapOptions.B0 = Boolean.valueOf(obtainAttributes.getBoolean(wvb.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.C0 = Float.valueOf(obtainAttributes.getFloat(wvb.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.D0 = Float.valueOf(obtainAttributes.getFloat(wvb.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_backgroundColor)) {
            googleMapOptions.G0 = Integer.valueOf(obtainAttributes.getColor(wvb.MapAttrs_backgroundColor, J0.intValue()));
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_mapId) && (string = obtainAttributes.getString(wvb.MapAttrs_mapId)) != null && !string.isEmpty()) {
            googleMapOptions.H0 = string;
        }
        if (obtainAttributes.hasValue(wvb.MapAttrs_mapColorScheme)) {
            googleMapOptions.I0 = obtainAttributes.getInt(wvb.MapAttrs_mapColorScheme, 0);
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, wvb.MapAttrs);
        float f = 0.0f;
        Float valueOf = obtainAttributes2.hasValue(wvb.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes2.getFloat(wvb.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float valueOf2 = obtainAttributes2.hasValue(wvb.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes2.getFloat(wvb.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float valueOf3 = obtainAttributes2.hasValue(wvb.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes2.getFloat(wvb.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float valueOf4 = obtainAttributes2.hasValue(wvb.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes2.getFloat(wvb.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        obtainAttributes2.recycle();
        if (!(valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null)) {
            latLngBounds = new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
        }
        googleMapOptions.E0 = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, wvb.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes3.hasValue(wvb.MapAttrs_cameraTargetLat) ? obtainAttributes3.getFloat(wvb.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes3.hasValue(wvb.MapAttrs_cameraTargetLng) ? obtainAttributes3.getFloat(wvb.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        float f2 = obtainAttributes3.hasValue(wvb.MapAttrs_cameraZoom) ? obtainAttributes3.getFloat(wvb.MapAttrs_cameraZoom, 0.0f) : 0.0f;
        float f3 = obtainAttributes3.hasValue(wvb.MapAttrs_cameraBearing) ? obtainAttributes3.getFloat(wvb.MapAttrs_cameraBearing, 0.0f) : 0.0f;
        if (obtainAttributes3.hasValue(wvb.MapAttrs_cameraTilt)) {
            f = obtainAttributes3.getFloat(wvb.MapAttrs_cameraTilt, 0.0f);
        }
        obtainAttributes3.recycle();
        googleMapOptions.o = new CameraPosition(latLng, f2, f, f3);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        mn mnVar = new mn((Object) this);
        mnVar.r(Integer.valueOf(this.c), "MapType");
        mnVar.r(this.z0, "LiteMode");
        mnVar.r(this.o, "Camera");
        mnVar.r(this.Y, "CompassEnabled");
        mnVar.r(this.X, "ZoomControlsEnabled");
        mnVar.r(this.Z, "ScrollGesturesEnabled");
        mnVar.r(this.w0, "ZoomGesturesEnabled");
        mnVar.r(this.x0, "TiltGesturesEnabled");
        mnVar.r(this.y0, "RotateGesturesEnabled");
        mnVar.r(this.F0, "ScrollGesturesEnabledDuringRotateOrZoom");
        mnVar.r(this.A0, "MapToolbarEnabled");
        mnVar.r(this.B0, "AmbientEnabled");
        mnVar.r(this.C0, "MinZoomPreference");
        mnVar.r(this.D0, "MaxZoomPreference");
        mnVar.r(this.G0, "BackgroundColor");
        mnVar.r(this.E0, "LatLngBoundsForCameraTarget");
        mnVar.r(this.a, "ZOrderOnTop");
        mnVar.r(this.b, "UseViewLifecycleInFragment");
        mnVar.r(Integer.valueOf(this.I0), "mapColorScheme");
        return mnVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        byte W = jjd.W(this.a);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(W);
        byte W2 = jjd.W(this.b);
        ek8.p0(parcel, 3, 4);
        parcel.writeInt(W2);
        int i2 = this.c;
        ek8.p0(parcel, 4, 4);
        parcel.writeInt(i2);
        ek8.j0(parcel, 5, this.o, i);
        byte W3 = jjd.W(this.X);
        ek8.p0(parcel, 6, 4);
        parcel.writeInt(W3);
        byte W4 = jjd.W(this.Y);
        ek8.p0(parcel, 7, 4);
        parcel.writeInt(W4);
        byte W5 = jjd.W(this.Z);
        ek8.p0(parcel, 8, 4);
        parcel.writeInt(W5);
        byte W6 = jjd.W(this.w0);
        ek8.p0(parcel, 9, 4);
        parcel.writeInt(W6);
        byte W7 = jjd.W(this.x0);
        ek8.p0(parcel, 10, 4);
        parcel.writeInt(W7);
        byte W8 = jjd.W(this.y0);
        ek8.p0(parcel, 11, 4);
        parcel.writeInt(W8);
        byte W9 = jjd.W(this.z0);
        ek8.p0(parcel, 12, 4);
        parcel.writeInt(W9);
        byte W10 = jjd.W(this.A0);
        ek8.p0(parcel, 14, 4);
        parcel.writeInt(W10);
        byte W11 = jjd.W(this.B0);
        ek8.p0(parcel, 15, 4);
        parcel.writeInt(W11);
        ek8.h0(parcel, 16, this.C0);
        ek8.h0(parcel, 17, this.D0);
        ek8.j0(parcel, 18, this.E0, i);
        byte W12 = jjd.W(this.F0);
        ek8.p0(parcel, 19, 4);
        parcel.writeInt(W12);
        Integer num = this.G0;
        if (num != null) {
            ek8.p0(parcel, 20, 4);
            parcel.writeInt(num.intValue());
        }
        ek8.k0(parcel, 21, this.H0);
        int i3 = this.I0;
        ek8.p0(parcel, 23, 4);
        parcel.writeInt(i3);
        ek8.o0(parcel, n0);
    }
}
