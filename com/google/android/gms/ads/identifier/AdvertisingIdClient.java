package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import me.leolin.shortcutbadger.BuildConfig;

public class AdvertisingIdClient {
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;
    jo0 zza;
    r3g zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzi;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        int i;
        int i2;
        AdvertisingIdClient advertisingIdClient = zzh;
        if (advertisingIdClient == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient = zzh;
                    if (advertisingIdClient == null) {
                        advertisingIdClient = new AdvertisingIdClient(context);
                        zzh = advertisingIdClient;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzd zza2 = zzd.zza(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Info zzf2 = advertisingIdClient.zzf(-1);
            advertisingIdClient.zze(zzf2, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, BuildConfig.FLAVOR, (Throwable) null);
            zza2.zzc(35401, 0, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            return zzf2;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            advertisingIdClient.zze((Info) null, true, 0.0f, -1, BuildConfig.FLAVOR, th3);
            if (th3 instanceof IOException) {
                i2 = 1;
            } else if (th3 instanceof GooglePlayServicesNotAvailableException) {
                i2 = 9;
            } else if (th3 instanceof GooglePlayServicesRepairableException) {
                i2 = 16;
            } else if (th3 instanceof IllegalStateException) {
                i2 = 8;
            } else {
                i = -1;
                zza2.zzc(35401, i, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
                throw th3;
            }
            i = i2;
            zza2.zzc(35401, i, elapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
            throw th3;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, false, false);
        boolean z = false;
        try {
            advertisingIdClient.zzc(false);
            a24.n("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                a24.o(advertisingIdClient.zza);
                a24.o(advertisingIdClient.zzb);
                o2g o2g = (o2g) advertisingIdClient.zzb;
                o2g.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                Parcel k = o2g.k(obtain, 6);
                int i = b2g.a;
                if (k.readInt() != 0) {
                    z = true;
                }
                k.recycle();
            }
            advertisingIdClient.zzb();
            advertisingIdClient.zza();
            return z;
        } catch (RemoteException e) {
            throw new IOException("Remote exception", e);
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final Info zzf(int i) throws IOException {
        Info info;
        a24.n("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            a24.o(this.zza);
            a24.o(this.zzb);
            try {
                o2g o2g = (o2g) this.zzb;
                o2g.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                Parcel k = o2g.k(obtain, 1);
                String readString = k.readString();
                k.recycle();
                o2g o2g2 = (o2g) this.zzb;
                o2g2.getClass();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i2 = b2g.a;
                obtain2.writeInt(1);
                Parcel k2 = o2g2.k(obtain2, 2);
                if (k2.readInt() == 0) {
                    z = false;
                }
                k2.recycle();
                info = new Info(readString, z);
            } catch (RemoteException e) {
                throw new IOException("Remote exception", e);
            }
        }
        zzb();
        return info;
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzc(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            defpackage.a24.n(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.zzi     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x002a
            jo0 r0 = r3.zza     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x000f
            goto L_0x002a
        L_0x000f:
            boolean r0 = r3.zzc     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001e
            nfc r0 = defpackage.nfc.p()     // Catch:{ all -> 0x001e }
            android.content.Context r1 = r3.zzi     // Catch:{ all -> 0x001e }
            jo0 r2 = r3.zza     // Catch:{ all -> 0x001e }
            r0.r(r1, r2)     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = 0
            r3.zzc = r0     // Catch:{ all -> 0x0028 }
            r0 = 0
            r3.zzb = r0     // Catch:{ all -> 0x0028 }
            r3.zza = r0     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r0 = move-exception
            goto L_0x002c
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            return
        L_0x002c:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|9|10|(1:12)|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zzd
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.zzb r1 = r5.zze     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.util.concurrent.CountDownLatch r1 = r1.zza     // Catch:{ all -> 0x0012 }
            r1.countDown()     // Catch:{ all -> 0x0012 }
            com.google.android.gms.ads.identifier.zzb r1 = r5.zze     // Catch:{ InterruptedException -> 0x0014 }
            r1.join()     // Catch:{ InterruptedException -> 0x0014 }
            goto L_0x0014
        L_0x0012:
            r5 = move-exception
            goto L_0x0025
        L_0x0014:
            long r1 = r5.zzf     // Catch:{ all -> 0x0012 }
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0023
            com.google.android.gms.ads.identifier.zzb r3 = new com.google.android.gms.ads.identifier.zzb     // Catch:{ all -> 0x0012 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0012 }
            r5.zze = r3     // Catch:{ all -> 0x0012 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zzb():void");
    }

    public final void zzc(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        a24.n("Calling this from your main thread can lead to deadlock");
        if (z) {
            zzb();
        }
        synchronized (this) {
            try {
                if (!this.zzc) {
                    Context context = this.zzi;
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int b = na6.b.b(context, 12451000);
                    if (b != 0) {
                        if (b != 2) {
                            throw new IOException("Google Play services not available");
                        }
                    }
                    jo0 jo0 = new jo0();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (nfc.p().s(context, context.getClass().getName(), intent, jo0, 1, (Executor) null)) {
                        this.zza = jo0;
                        IBinder a = jo0.a(TimeUnit.MILLISECONDS);
                        int i = z2g.c;
                        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this.zzb = queryLocalInterface instanceof r3g ? (r3g) queryLocalInterface : new o2g(a);
                        this.zzc = true;
                        return;
                    }
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new GooglePlayServicesNotAvailableException(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void zzd() throws IOException {
        try {
            if (!this.zzc) {
                zzc(false);
                if (!this.zzc) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.");
                }
            }
        } catch (Exception e) {
            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final boolean zze(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (info != null) {
            if (true != info.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String id = info.getId();
            if (id != null) {
                hashMap.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new zza(this, hashMap).start();
        return true;
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        this.zzd = new Object();
        a24.o(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j;
    }
}
