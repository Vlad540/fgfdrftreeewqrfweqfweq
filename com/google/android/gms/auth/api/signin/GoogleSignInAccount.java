package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.fresco.middleware.HasExtraData;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class GoogleSignInAccount extends o3 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new udf(5);
    public final String A0;
    public final HashSet B0 = new HashSet();
    public final String X;
    public final Uri Y;
    public String Z;
    public final int a;
    public final String b;
    public final String c;
    public final String o;
    public final long w0;
    public final String x0;
    public final List y0;
    public final String z0;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = str4;
        this.Y = uri;
        this.Z = str5;
        this.w0 = j;
        this.x0 = str6;
        this.y0 = arrayList;
        this.z0 = str7;
        this.A0 = str8;
    }

    public static GoogleSignInAccount b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString(HasExtraData.KEY_ID);
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        a24.k(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.Z = str2;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.x0.equals(this.x0)) {
            HashSet hashSet = new HashSet(googleSignInAccount.y0);
            hashSet.addAll(googleSignInAccount.B0);
            HashSet hashSet2 = new HashSet(this.y0);
            hashSet2.addAll(this.B0);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashSet hashSet = new HashSet(this.y0);
        hashSet.addAll(this.B0);
        return ((this.x0.hashCode() + 527) * 31) + hashSet.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.k0(parcel, 2, this.b);
        ek8.k0(parcel, 3, this.c);
        ek8.k0(parcel, 4, this.o);
        ek8.k0(parcel, 5, this.X);
        ek8.j0(parcel, 6, this.Y, i);
        ek8.k0(parcel, 7, this.Z);
        ek8.p0(parcel, 8, 8);
        parcel.writeLong(this.w0);
        ek8.k0(parcel, 9, this.x0);
        ek8.m0(parcel, this.y0, 10);
        ek8.k0(parcel, 11, this.z0);
        ek8.k0(parcel, 12, this.A0);
        ek8.o0(parcel, n0);
    }
}
