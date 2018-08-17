package app.eospocket.android.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

import java.text.DecimalFormat;

public class Utils {

    private static final DecimalFormat BALANCE_FORMAT = new DecimalFormat("#,##0.000000");
    private static final DecimalFormat NUMBER_FORMAT = new DecimalFormat("#,##0");
    private static final DecimalFormat USD_FORMAT = new DecimalFormat("#,##0.000");
    private static final DecimalFormat PERCENT_FORMAT = new DecimalFormat("#,##0.00");

    public int sum(int a, int b) {
        return a + b;
    }

    public static String formatBalance(double balance) {
        return BALANCE_FORMAT.format(balance);
    }

    public static String formatUsd(double balance) {
        return USD_FORMAT.format(balance);
    }

    public static void copyToClipboard(Context context, String content) {
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("", content);
        clipboard.setPrimaryClip(clip);
    }
}
