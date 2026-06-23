-- Reset tables when column types were created incorrectly by earlier entity versions.
-- Hibernate recreates them after this script (see application.properties).
DROP TABLE IF EXISTS order_details;
DROP TABLE IF EXISTS order_header;
