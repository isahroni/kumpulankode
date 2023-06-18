private void getVersionApp(){
        PackageManager packageManager = getActivity().getPackageManager();
        try {
            PackageInfo info = packageManager.getPackageInfo(getActivity().getPackageName(), 0);
            String version = info.versionName;

            itemVersion.setText("App Version "+version);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
}
