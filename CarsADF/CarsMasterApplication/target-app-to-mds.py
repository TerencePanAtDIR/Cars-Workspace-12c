# Below args are passed by the ant script
print 'sys.argv[1] = ' + sys.argv[1]
applicationWarFileLocation=sys.argv[1]
print 'sys.argv[2] = ' + sys.argv[2]
applicationWarName=sys.argv[2]
print 'sys.argv[3] = ' + sys.argv[3]
applicationMdsRepository=sys.argv[3]
print 'sys.argv[4] = ' + sys.argv[4]
applicationMdsPartition=sys.argv[4]
print 'sys.argv[5] = ' + sys.argv[5]
applicationMdsType=sys.argv[5]
print 'sys.argv[6] = ' + sys.argv[6]
applicationMdsJndi=sys.argv[6]
# Target MDS to newly built application
print 'updating MDS config'
archive = getMDSArchiveConfig(fromLocation=applicationWarFileLocation)
archive.setAppMetadataRepository(repository=applicationMdsRepository,partition=applicationMdsPartition, type=applicationMdsType,jndi=applicationMdsJndi)
archive.save()
print 'updating MDS config done!'