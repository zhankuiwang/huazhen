#!/bin/sh
############################
# @file process_product_sales.sh
# @process mail
# @author He Xin
# @version 1.0
# @date 2015-2-28
############################
echo "####################################"
echo "####process mail####"
echo `date '+%Y-%m-%d %H:%M:%S'`"---start"
python /home/shell/performance.py 
echo `date '+%Y-%m-%d %H:%M:%S'`"---end"
echo "####################################"
exit 0;