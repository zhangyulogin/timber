package com.example.timber.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

@SuppressLint("Registered") //
public class LintActivity extends Activity {
  /**
   * Below are some examples of how NOT to use Timber.
   *
   * Currently, locally-packaged lint checks don't work in Studio. As a workaround,
   * you will need to run "./gradlew :timber-sample:lint" first, before Lint IDE
   * highlighting will work.
   *
   * A future release will eliminate the 'command-line first' workaround.
   */
  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    /*
    // LogNotTimber
    Log.d("TAG", "msg");
    Log.d("TAG", "msg", new Exception());
    android.util.Log.d("TAG", "msg");
    android.util.Log.d("TAG", "msg", new Exception());

    // StringFormatInTimber
    Timber.w(String.format("%s", getString()));
    Timber.w(format("%s", getString()));

    // ThrowableNotAtBeginning
    Timber.d("%s", new Exception());

    // BinaryOperationInTimber
    String foo = "foo";
    String bar = "bar";
    Timber.d("foo" + "bar");
    Timber.d("foo" + bar);
    Timber.d(foo + "bar");
    Timber.d(foo + bar);

    // TimberArgCount
    Timber.d("%s %s", "arg0");
    Timber.d("%s", "arg0", "arg1");
    Timber.tag("tag").d("%s %s", "arg0");
    Timber.tag("tag").d("%s", "arg0", "arg1");

    // TimberArgTypes
    Timber.d("%d", "arg0");
    Timber.tag("tag").d("%d", "arg0");

    // TimberTagLength
    Timber.tag("abcdefghijklmnopqrstuvwx");
    Timber.tag("abcdefghijklmnopqrstuvw" + "x");

    // TimberExceptionLogging
    Timber.d(new Exception(), new Exception().getMessage());
    Timber.d(new Exception(), "");
    Timber.d(new Exception(), null);
    */
  }

  private String getString() {
    return "foo";
  }
}
