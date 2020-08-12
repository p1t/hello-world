    private Boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(DateUtil.YYYYMMDD);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
            log.error("Wrong date format: {}, Please enter the date in the format yyyyMMdd", dateStr);
            return false;
        }
        return true;
    }
