package com.google.android.gms.ads.identifier;

public final /* synthetic */ class zzc implements kx9 {
    public final /* synthetic */ zzd zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzc(zzd zzd, long j) {
        this.zza = zzd;
        this.zzb = j;
    }

    public final void onFailure(Exception exc) {
        zzd.zzb(this.zza, this.zzb, exc);
    }
}
